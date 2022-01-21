package com.ibm.currencyConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.ibm.currencyConverter.bean.CurrencyConverter;
import com.ibm.currencyConverter.client.ManageCurrencyConversionClient;

@RestController
@RequestMapping("/convertedValue")
public class CurrencyConverterController {

	@Autowired
	private ManageCurrencyConversionClient manageCurrencyConversionClient;

	@PostMapping("/of/{countryCode}/amount/{amount}/to/inr")
	public CurrencyConverter getConvertedAmount(@PathVariable String countryCode, @PathVariable Double amount) {
		ResponseEntity<JsonNode> conversionFactor = manageCurrencyConversionClient.getConversionFactor(countryCode);
		System.out.println(conversionFactor);

		JsonNode jsonNode = conversionFactor.getBody().get("conversionFactor");

		Double value = jsonNode.at("conversionFactor").asDouble();
		System.out.println(value);

		CurrencyConverter converter = new CurrencyConverter();
		converter.setAmount(value * amount);
		System.out.println(converter);
		return converter;
	}
}
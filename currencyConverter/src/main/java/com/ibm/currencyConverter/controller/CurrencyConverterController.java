package com.ibm.currencyConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.currencyConverter.bean.CurrencyConverter;
import com.ibm.currencyConverter.dto.ManageCurrencyConversionDto;
import com.ibm.currencyConverter.client.ManageCurrencyConversionClient;

@RestController
@RequestMapping("/convertedValue")
public class CurrencyConverterController {

	@Autowired
	private ManageCurrencyConversionClient manageCurrencyConversionClient;

	@GetMapping("/of/{countryCode}/amount/{amount}/to/inr")
	public CurrencyConverter getConvertedAmount(@PathVariable String countryCode, @PathVariable Double amount) {
		ManageCurrencyConversionDto conversionFactor = (manageCurrencyConversionClient.getConversionFactor(countryCode)).getBody();
		System.out.println(conversionFactor.getConversionFactor());

		CurrencyConverter converter = new CurrencyConverter();
		converter.setAmount(conversionFactor.getConversionFactor() * amount);
		System.out.println(converter);
		return converter;
	}
}
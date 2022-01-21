package com.ibm.currencyConverter.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.JsonNode;

@FeignClient(name = "manageCurrencyConversion")
public interface ManageCurrencyConversionClient {

	@RequestMapping(value = "/manageCurrencyConversion/getRecords/{countryCode}", method = RequestMethod.GET)
	ResponseEntity<JsonNode> getConversionFactor(@PathVariable(name = "countryCode") String countryCode);
}
package com.ibm.currencyConverter.dto;

import lombok.Data;

@Data
public class ManageCurrencyConversionDto {
		
		private Long id;
		
		private String countryCode;
		
		private double conversionFactor;
}

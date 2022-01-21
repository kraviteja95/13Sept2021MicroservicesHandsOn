package com.ibm.manageCurrencyConversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ManageCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageCurrencyConversionApplication.class, args);
	}

}

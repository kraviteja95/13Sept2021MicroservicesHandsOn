package com.ibm.manageCurrencyConversion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.manageCurrencyConversion.entity.ManageCurrencyConversion;
import com.ibm.manageCurrencyConversion.repository.ManageCurrencyConversionRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manageCurrencyConversion")
public class ManageCurrencyConversionController {

	@Autowired
	private ManageCurrencyConversionRepository manageCurrencyConversionRepository;
	private ManageCurrencyConversion manageCurrencyConversionDetails;

	// Insert records using API
	@PostMapping("/addRecords")
	public ManageCurrencyConversion createManageCurrencyConversion(
			@RequestBody ManageCurrencyConversion manageCurrencyConversion) {
		return manageCurrencyConversionRepository.save(manageCurrencyConversion);
	}

	// Update the existing records using API
	@PutMapping("/updateRecords/{countryCode}")
	public ResponseEntity<ManageCurrencyConversion> updateManageCurrencyConversion(@PathVariable String countryCode, @RequestBody ManageCurrencyConversion manageCurrencyConversion) {
		ManageCurrencyConversion manageCurrencyConversion1 = manageCurrencyConversionRepository.findByCountryCode(countryCode);
		manageCurrencyConversion1.setConversionFactor(manageCurrencyConversion.getConversionFactor());
		
		ManageCurrencyConversion updatedManageCurrencyConversion = manageCurrencyConversionRepository.save(manageCurrencyConversion1);
		return ResponseEntity.ok(updatedManageCurrencyConversion);
	}

	// Get all the records using API
	@GetMapping("/getAllRecords")
	public List<ManageCurrencyConversion> getAllManageCurrencyConversion() {
		return manageCurrencyConversionRepository.findAll();
	}
	
	// Get record by ID using API
    @GetMapping("/getRecords/{countryCode}")
    public ResponseEntity<ManageCurrencyConversion> getConversionFactorByCountryCode(@PathVariable String countryCode) {
    	ManageCurrencyConversion manageCurrencyConversion = manageCurrencyConversionRepository.findByCountryCode(countryCode);
        return ResponseEntity.ok(manageCurrencyConversion);
    }

}

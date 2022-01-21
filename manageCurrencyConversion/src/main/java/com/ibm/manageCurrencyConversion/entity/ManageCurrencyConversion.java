package com.ibm.manageCurrencyConversion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "manage_currency_conversion")
public class ManageCurrencyConversion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "country_code")
	private String countryCode;

	@Column(name = "conversion_factor")
	private double conversionFactor;

	/*
	 * public ManageCurrencyConversion() {
	 * 
	 * }
	 * 
	 * public ManageCurrencyConversion(Long id, String countryCode, double
	 * conversionFactor) { super(); this.id = id; this.countryCode = countryCode;
	 * this.conversionFactor = conversionFactor; }
	 * 
	 * public Long getId() { return id; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public String getCountryCode() { return countryCode; }
	 * 
	 * public void setCountryCode(String countryCode) { this.countryCode =
	 * countryCode; }
	 * 
	 * public double getConversionFactor() { return conversionFactor; }
	 * 
	 * public void setConversionFactor(double conversionFactor) {
	 * this.conversionFactor = conversionFactor; }
	 */

	@Override
	public String toString() {
		return "ManageCurrencyConversion [id=" + id + ", countryCode=" + countryCode + ", conversionFactor="
				+ conversionFactor + "]";
	}

}

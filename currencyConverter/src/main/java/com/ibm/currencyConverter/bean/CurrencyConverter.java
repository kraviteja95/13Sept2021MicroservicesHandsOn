package com.ibm.currencyConverter.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyConverter {

	private double amount;

	@Override
	public String toString() {
		return "CurrencyConverter [amount=" + amount + "]";
	}

}

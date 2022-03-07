package com.ibm.xe;

public class TestCurrency {
	public static void main(String[] args) {
		Rupee r = new Rupee();
		Dollar u = new Dollar();
		CurrencyConverter c = new CurrencyConverter();
		System.out.println(c.convert(u, r, 10));
	}
}

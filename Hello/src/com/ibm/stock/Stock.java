package com.ibm.stock;

class Stock implements Exchange{
//	private static Stock Instance;
//	private Stock() {
//	}
//	public static Stock getInstance() {
//		if(Instance == null)
//			Instance = new Stock();
//		return Instance;
//	}
	
	public void viewQoute() {
		System.out.println("View Quote");
	}
	public void getQoute() {
		System.out.println("Get Quote");
	}
	public void setQoute() {
		System.out.println("Set Quote");
	}
}
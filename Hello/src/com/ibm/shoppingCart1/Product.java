package com.ibm.shoppingCart1;

public class Product {
	private String name;
	private double price;
	private int stock;
	
	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(stock + "\n");
	}
}

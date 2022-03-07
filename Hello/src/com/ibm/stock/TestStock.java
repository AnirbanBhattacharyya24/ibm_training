package com.ibm.stock;

public class TestStock {
	public static void main(String[] args)
	{
		Holder h=StockSingleton.getStock();
		h.viewQoute();
		
		Broker b=StockSingleton.getStock();
		b.getQoute();
		b.viewQoute();
		
		Exchange x=StockSingleton.getStock();
		x.setQoute();
		x.getQoute();
		x.viewQoute();
		
		System.out.println(h==b);
		System.out.println(b==x);
	}
}

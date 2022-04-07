package com.ibm.shoppingCart1;

public class TestCart {

	public static void main(String[] args) {
		Product p1=new Product("Tea",120,5);
		Product p2=new Product("lotte chocopie",10,5);
		Product p3=new Product("Cake",250,5);
		
//		p1.print();
//		p2.print();
//		p3.print();
		
		ShoppingCart s1=new ShoppingCart();
		s1.addToCart(p3, 2);
		s1.addToCart(p2, 3);
//		s1.addToCart(p1, 3);
		s1.checkout();
//		p2.print();
//		p3.print();
//			
	}
}

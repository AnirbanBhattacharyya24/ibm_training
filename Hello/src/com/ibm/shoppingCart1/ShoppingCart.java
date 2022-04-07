package com.ibm.shoppingCart1;

public class ShoppingCart {
	
	private int count;
	private Product[] arr ;
	private double total;
	
	public ShoppingCart() {
		arr=new Product[5];
	}
	
	public void addToCart(Product a,int q) {
			if(arr[0]==null && q<=a.getStock())
			{
				if(q>1) {
					for(int i=0;i<q;i++)
						arr[count++]=a;
				}
				else
					arr[count++]=a;
				
				total+=a.getPrice()*q;
				
				a.setStock(a.getStock()-q);
			}
			
			else if(arr[0]!=null && q<=a.getStock())
			{
				for(int i=0;i<q;i++)
					arr[count++]=a;
			
				total+=a.getPrice()*q;
					
				a.setStock(a.getStock()-q);
			}
			
			System.out.println(q+" "+a.getName()+ " has been added to cart "+count);
			
	} 
	
	
	public void checkout() {
		if(arr[0]==null)
			System.out.println("nothing to checkout");
		else	
			System.out.println("total amount = " + total);
	}
	
	
}

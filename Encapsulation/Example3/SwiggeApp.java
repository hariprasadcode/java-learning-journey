package com.dcl.swigge;

public class SwiggeApp {
	public static void main(String[] args) {
		Swigge so1=new Swigge();
		
		so1.setOrderId(101);
		so1.setitemName("Pizza");
		so1.setresturant("Dominos");
		so1.setaddress("BTM");
		so1.setPrice(500);
		
		System.out.println("First Order Placed");
		System.out.println("------------------");
		System.out.println("OrderId : "+so1.getOrderId());
		System.out.println("Item Name : "+so1.getItemName());
		System.out.println("Resturant : "+so1.getresturant());
		System.out.println("Address : "+so1.getaddress());
		System.out.println("Price : "+so1.getPrice());
		
		
		
		Swigge so2=new Swigge();
		
		so2.setOrderId(102);
		so2.setitemName("Burger");
		so2.setresturant("KFC");
		so2.setaddress("Silk Board");
		so2.setPrice(290);
		System.out.println("");

		System.out.println("------------------");
		System.out.println("Second Order Placed");
		System.out.println("------------------");
		System.out.println("OrderId : "+so2.getOrderId());
		System.out.println("Item Name : "+so2.getItemName());
		System.out.println("Resturant : "+so2.getresturant());
		System.out.println("Address : "+so2.getaddress());
		System.out.println("Price : "+so2.getPrice());

		
		
	}

}

package com.equals_method;
/*Using default implementation of equals()to compare two objects*/
public class Bike {

	String model;
	int price;
	public Bike(String model, int price) {
		
		this.model = model;
		this.price = price;
	}
	
	public static void main(String[] args) {
		Bike b1=new Bike("R15", 100000);
		Bike b2=new Bike("R15", 100000);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1==b2); //false-comparing object addresses
		System.out.println(b1.equals(b2));// false- comparing object addresses

	}
	
}

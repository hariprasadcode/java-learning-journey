package com.dcl;
/*Accessing private members from same class*/
public class Car {
	
	private String brand="BMW";
	
	private Car() {
		System.out.println("inside a constructor");
	}
	private void speed() {
		System.out.println("High speed");
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.brand);
		c1.speed();
		
	}
	

}

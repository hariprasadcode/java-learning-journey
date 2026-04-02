package com.dcl;
/*Accessing private members from different class but same package which is not possible
 * even from different package its not possible*/
public class CarApp {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.brand);
		c1.speed();
		
	}

}

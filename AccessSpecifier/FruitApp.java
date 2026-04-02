package com.dcl;
/*Accessing a default (no keyword) members from different class but same package*/
public class FruitApp {
	public static void main(String[] args) {
		Fruit f1=new Fruit();
		System.out.println(f1.price);
		f1.sell();
	}

}

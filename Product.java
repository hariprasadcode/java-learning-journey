package com.dcl;

public class Product {
	public static void main(String[] args) {
		Product p= new Product();
		System.out.println(p);
		
		System.out.println(p.hashCode());
		// Prints the hash code in hexadecimal form
		System.out.printf("%x",p.hashCode());
		
		
	}

}

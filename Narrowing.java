package com.dcl;

public class Narrowing {
	
	public static void main(String[] args) {
		
		double a=23.4d;
		System.out.println("a: "+a);
		float b=(float)a;
		System.out.println("b: "+b);
		
		float c=1231.2f;
		char d=(char)c;
		
		
		float e=67.3F;
		float f=(float)1.3;
		float g=1231.2f;
	}

}

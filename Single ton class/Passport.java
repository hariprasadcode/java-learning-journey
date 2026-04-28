package com.example2;

public class Passport {
    
	private static Passport obj;
	
	private Passport() {
		System.out.println("Passport created");
	}
	public static void createPasportObject() {
		if (obj==null)
		obj=new Passport();
	}
}

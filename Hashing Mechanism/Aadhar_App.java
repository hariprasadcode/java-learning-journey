package com.dcl;

public class Aadhar_App {
	public static void main(String[] args) {
		AadharCard a1= new AadharCard("hari", 123454321);
		AadharCard a2= new AadharCard("hariPrasad", 454321123);
		AadharCard a3= new AadharCard("Prasad", 987454321);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());

		
	}

}

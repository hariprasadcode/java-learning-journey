package com;

public class Aadhar {
	// private static non primitive reference variable
	 private static Aadhar obj;
    //created an private constructor
	 private Aadhar() {
		 System.out.println("Aadhar created");
	 }
	 //created a public static Helper method to create a single object
	 public static void createAadharObject() {
		 if(obj==null) {
		 obj= new Aadhar();
		 }
	 }
	 
}

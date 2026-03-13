package com;

public class family {
	//declaring static variable.
	static int mem;
	
	//declaring non static variable.
	String relig ;
	
	// creating Static Block. which will execute before the main method. 
	static {
		   //initializing a static variable
		   mem=13;
		   System.out.println("Total Members in Family : "+mem);
		   
		   //To initialize a non static variable we need to create object, then initialize
		   family fam = new family();
		   fam.relig="chris"; 
		   System.out.println("Religion : "+fam.relig);

	      }
	
	//creating non static block... if need to create an object inside another method to call this
	{
		System.out.println("inside a non static block");
		
	}
	
	public static void main(String[] args) {
		
		   family fam = new family();
		   

		
	}
	
	static
	{
		System.out.println("inside a  static block at end");
		
	}
}

package com.dcl;

public class App {
	public static void main(String[] args) {
		
	    // ------------------ UPCASTING ------------------
        // Creating object of Son but referencing it with Father type
        // This is called Upcasting (Child -> Parent)
		Father f=new Son();
		 // Accessible: Only parent class members
		System.out.println(f.height);
		// Not Accessible: Child class members using parent reference
		//System.out.println(f.age);
		
	    // ------------------ DOWNCASTING ------------------
        // Converting parent reference back to child reference
        // This is called Downcasting (Parent -> Child)
		Son s=(Son)f;
		// Now both parent and child properties are accessible
		System.out.println(s.height);
		System.out.println(s.age);
		
	}

}

package com.hashcode_method;
//This program creates a User object and prints its hashCode and string representation using toString().
public class User {

	public static void main(String[] args) {
		User u1=new User();
		
		// Prints the hash code value of the User object
		System.out.println(u1.hashCode());
		
		// Prints the string representation of the User object (class name + hash code)
		System.out.println(u1.toString());
		

	}
}

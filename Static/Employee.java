package com;
//Example for a Static 
public class Employee {
	
	//declaring and initializing the static variable
	static int age=45;
	static String name="jhon";
	
	//creating a static method
	public static void work() {
		System.out.println("Working");
	}
	
	//main method 
	public static void main(String[] args) {
		
		// no need to create an object
		System.out.println(age);   // only if its in same class
		System.out.println(Employee.name);  // if in same class and if in another class
		// no need to create an object to call a method , as it is a static method
		work();// only if its in same class
		Employee.work();// in same class and if in another class
		
	}

}

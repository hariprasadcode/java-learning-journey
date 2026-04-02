package com.dcl;
/*Accessing protected members from same class*/
public class Employee {
	
	protected int id=101;
	
	protected Employee() {
		System.out.println("inside a constructor");
	}

	protected void work() {
		System.out.println("working");
	}
	public static void main(String[] args) {
		Employee e1 =new Employee();
		System.out.println(e1.id);
		e1.work();
		
	}
}

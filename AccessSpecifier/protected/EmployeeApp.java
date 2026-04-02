package com.dcl;
/*Accessing protected members in the different class in the same package*/
public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 =new Employee();
		System.out.println(e1.id);
		e1.work();
		
	}

}

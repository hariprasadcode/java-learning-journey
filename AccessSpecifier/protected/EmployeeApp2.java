package com.dcl.demo;

import com.dcl.Employee;
/*Accessing protected members from Employee(parent class) via IS-A relationship*/
public class EmployeeApp2 extends Employee{
	public static void main(String[] args) {
		EmployeeApp2 ea=new EmployeeApp2();
		System.out.println(ea.id);
		ea.work();
	}

}

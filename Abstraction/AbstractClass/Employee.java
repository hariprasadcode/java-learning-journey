package com.dcl;
/*Concrete class extending from abstract person class*/
public class Employee extends Person{
/*overriding the method of person class*/
	@Override
	void work() {
		System.out.println("Working");
	}
	public static void main(String[] args) {
		Person p=new Employee();//upcasting
		p.work();//runtime polymorphism.
	}
}

package com.equals_method;

public class Employee {

	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public boolean equals(Object o) {
		
		Employee emp=(Employee)o;
		return this.name==emp.name && this.salary==emp.salary;
		
	}
	public static void main(String[] args) {
		Employee e1=new Employee("jhon", 55000.0);
		Employee e2=new Employee("Tim", 56000.0);
		
		System.out.println(e1.equals(e2));
	}
}

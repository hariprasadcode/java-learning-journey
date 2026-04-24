package com;

public class Employee {

	int id;
	String name;
	String desc;
	double salary;
	 Employee(int id , String name ,String desc ,double salary){
		 this.id=id;
		 this.name=name;
		 this.desc=desc;
		 this.salary=salary;
	 }
	 @Override
	 public String toString() {
		 return "id : "+id+" ,name : "+ name+" ,desc:"+desc+", salary : "+salary;
	 }
	
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"shyam","manager",300000);
		Employee e2=new Employee(102,"rajesh","hr",100000);
		Employee e3=new Employee(103,"laxmi","developer",200000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		

	}
}

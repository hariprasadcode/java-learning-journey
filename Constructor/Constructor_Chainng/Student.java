package com;

 class Student {
	 
	 Student(int age){
		 this("jhon");
		 System.out.println("Age : "+age);
	 }
	 Student(String name){
		 System.out.println("Name : "+name); 
	 }
	 Student(double height){
		 this(20);
		 System.out.println("Height : "+height);
	 }

	 public static void main(String[] args) {
		Student s = new Student(5.9);
	}
}

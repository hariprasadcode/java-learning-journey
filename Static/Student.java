package com.demo;


/*Demonstrating why static members should not be accessed using the object reference but should always be accessed by the class name*/
public class Student {
	static int age=20;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age=30;
		System.out.println(s1.age);
		
		Student s2 = new Student();
		System.out.println(s2.age);
		
		Student s3 = new Student();
		System.out.println(s3.age);
		
		
	}

}

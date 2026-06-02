package com.dcl;

public class Student_App {
	public static void main(String[] args) {
		Student s1=new Student(1, "hari");
		Student s2=new Student(2, "Prasad");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}

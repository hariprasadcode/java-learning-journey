package com.dcl.demo;
/*Accessing public members from different class and different package*/
import com.dcl.Student;

public class StudentApp2 {
	public static void main(String[] args) {
			Student s1=new Student();
			System.out.println(s1.a);
			s1.study();
	}

}

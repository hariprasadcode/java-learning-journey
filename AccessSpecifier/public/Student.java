
/*Example for Public  which is accessable from anywhere(same class , same pakage, different pakage)*/
package com.dcl;

public class Student {
	// variable with access specifier
	public int a=10;
	
	//constructor with access specifier
	public Student() {
		System.out.println("studying core java");
		
	}
	
	//method with access specifier
	public void study() {
		System.out.println("Studying access specifier");
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.a);
		s1.study();
		
	}
	

}

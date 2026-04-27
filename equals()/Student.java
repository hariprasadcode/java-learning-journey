package com.equals_method;

public class Student {
  int age;
  
  Student(int age){
	  this.age=age;
  }
  
  public boolean equals(Object obj) {
	  		/*NOTE 
		 * The s2 object which is of student classtype is getting upcasted to object obj
		 * and coming in the method parameter.
		 * using the upcasting parent class ref we can access the parent class propertyies
		 * we will have to down cast it to accessthe child class properties*/
	  Student student=(Student)obj;
	  return this.age==student.age;
  }
  
  
  public static void main(String[] args) {
	Student s1=new Student(30);
	Student s2=new Student(30);
	
	System.out.println(s1==s2);//false-comparing object addresses
	System.out.println(s1);
	System.out.println(s2);
	
	System.out.println(s1.equals(s2));//false-comparing object addresses
}
}

package com.dcl;

public class App3 {

	public static void main(String[] args) {
		Father f;
		f= new Son();
		//f= new Daughter();
		
		if(f instanceof Son) {
			System.out.println("Downcasting to son Type");
			Son s =(Son)f;
			System.out.println("Father age : "+s.age);
			System.out.println("son height : "+s.height);
		}
		else if(f instanceof Daughter) {
			System.out.println("Downcasting to Daughter Type: ");
			Daughter d=(Daughter)f;
			System.out.println("Father age : "+d.age);
			System.out.println("Daughte Salary :"+d.salary);
			
		}
	}
}

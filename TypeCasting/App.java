package com.dcl;

public class App {
	public static void main(String[] args) {
		
		//downcasting
		Father f=new Son();
		System.out.println(f.height);
		System.out.println(f.age);//not able the asses child class property
		
		//upcasting
		Son s=(Son)f;
		System.out.println(s.height);
		System.out.println(s.age);
		
	}

}

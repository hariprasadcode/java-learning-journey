package com.hp.example2;
/*Using supper calling statement to call parent class constructor 
we must used Super calling statement if there is parameterized 
constructor in parent class*/
public class Customer extends User{
	Customer(){
		super(2);
		System.out.println("customer constructor");
	}
	

}

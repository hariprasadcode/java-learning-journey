package com.dcl.example;
//class overidding all the abstrac method 
public class User implements HDFC{
	
	@Override
	public void withdraw() {
		System.out.println("Ammount withdraw");
	}
	@Override
	public void deposit() {
		System.out.println("ammount dposited");
	}
	
	public static void main(String[] args) {
		User u= new User();
		u.withdraw();
		u.deposit();
	}
	

}

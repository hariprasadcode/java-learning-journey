package com.dcl;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		
		ba.setBalance(990000.0);
		double result=ba.getBalance();
		System.out.println(result);
		
		
			}

}

package com.dcl.example2;

public class ATM implements Bank {
	int balance=1000;
	@Override
	public void deposit(int amount) {
		System.out.println("Amount deposited : "+amount);
		balance+=amount;//balance=balance+amount;
		System.out.println("Amount deposited Successfully!");
		System.out.println("--------------------------------");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Amount Withdrawn : "+amount);
		balance-=amount;//balance=balance-amount;
		System.out.println("Amount withdrawn Successfully!");
		System.out.println("--------------------------------");
		
	}
	
	@Override
	public void checkBalance() {
		System.out.println("balance :"+balance);
	}

}

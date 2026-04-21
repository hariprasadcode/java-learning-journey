package com.dcl.example2;

public class App {
	
	public static void main(String[] args) {
		ATM a=new ATM();
		a.checkBalance();
		a.deposit(1000000);
		a.checkBalance();
		a.withdraw(15000);
		a.checkBalance();
	}

}

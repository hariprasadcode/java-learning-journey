/*Example for encapsulation */
package com.dcl;
//class is public
public class BankAccount {
	//private varaibel
	private double balance;
	//public setter method
	public void setBalance(double balance) {
		this.balance=balance;
	}
	//public getter method
	public double getBalance() {
		return balance;
	}
}

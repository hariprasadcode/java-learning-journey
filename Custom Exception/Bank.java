package com.dcl.custom.checked;

import java.util.Scanner;



public class Bank {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int balance=1000000;
		System.out.println("Enter the amount: ");
		int amount =sc.nextInt();
		
		if(amount<=balance) {
			System.out.println(amount+" have been withdraw");
		}
		else {
			try {
			throw new InsufficentBalanceException();
			}
			catch(InsufficentBalanceException e) {
				System.out.println("insufficent balance");
				
			}
		}
	}

}

package com;

import java.util.Scanner;

public class BankAccountTransaction {

	public void getEmail() {
		System.out.println("Login Page ");
		System.out.println();
		System.out.print("Enter you Email id : ");
		

	}

	public static void main(String[] args) {

		BankAccountTransaction bat = new BankAccountTransaction();
		bat.getEmail();

		Scanner scan = new Scanner(System.in);
		String emailid = scan.next();

		if (emailid.endsWith("@gmail.com")) {
			System.out.println();

			System.out.print("Enter your Password : ");
			String password = scan.next();
			if (password.equals("123jhon*")) {

				System.out.println("Login Successful! Welcome to the portal.");

			}

			else {
				System.err.println("Wrong Password!!!!");
				System.out.println("Try Again 2 Attempt left");
				System.out.print("Enter your Password : ");
				String password1 = scan.next();
				if(password1.equals("123jhon*")) {
					System.out.println("Login Successful! Welcome to the portal.");	
				}
				else {
					System.err.println("Wrong Password!!!!");
					System.out.println("Try Again 1 Attempt left");
					System.out.print("Enter your Password : ");
					String password2 = scan.next();
					if(password2.equals("123jhon*")) {
						System.out.println("Login Successful! Welcome to the portal.");	
					}
					else {
						System.err.println("Wrong Password!!!!");
					}
					
				}
				
			}

		} else {
			System.err.println("invalid Email");

		}

	}

}
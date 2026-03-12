package com;

import java.util.Scanner;

public class BankAccountTransaction {

	double balance = 450000.00d;

	public void getEmail() {
		System.out.println("Welcome To Bank of NO-BANK ");
		System.out.println();
		System.out.print("Enter your Email Id : ");
	}

	public void getPassword() {
		System.out.println("Login Successful! Welcome to the portal.....");
		System.err.println();
		System.out.println("\nPress 1 to Check Balance \nPress 2 to Deposit \nPress 3 to Withdraw");
		System.out.print("Your Option : ");
	}

	public void balance() {
		System.out.println("The Balance is : " + balance);
	}

	public void deposit() {
		System.out.print("Deposit Amount : ");
		Scanner scan = new Scanner(System.in);
		double depositAmount = scan.nextDouble();
		balance = balance + depositAmount;
		System.out.println("Currnt balance after Deposit  : " + balance);

	}

	public void withDraw() {
		System.out.println("Withdraw Amount : ");
		Scanner scan = new Scanner(System.in);
		double withDraw = scan.nextDouble();
	
		if (withDraw > balance) {
			System.err.println("Insufficent Balance");
		} else {
			balance = balance - withDraw;
			System.out.println("Current Balance after Withdraw : " + balance);
		}

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
				bat.getPassword();
				int opt = scan.nextInt();
				if (opt == 1) {
					bat.balance();
				} else if (opt == 2) {
					bat.deposit();
				} else if (opt == 3) {
					bat.withDraw();
				} else {
					System.err.println("Invalid Option");
				}
			} else {
				System.err.println("Wrong Password!!!!");
				System.out.println("Try Again 2 Attempt left");
				System.out.print("Enter your Password : ");
				String password1 = scan.next();

				if (password1.equals("123jhon*")) {

					bat.getPassword();

					int opt = scan.nextInt();

					if (opt == 1) {
						bat.balance();
					} else if (opt == 2) {
						bat.deposit();
					} else if (opt == 3) {
						bat.withDraw();
					} else {
						System.err.println("Invalid Option");
					}
				} else {
					System.err.println("Wrong Password!!!!");
					System.out.println("Try Again 1 Attempt left");
					System.out.print("Enter your Password : ");
					String password2 = scan.next();

					if (password2.equals("123jhon*")) {
						bat.getPassword();
						int opt = scan.nextInt();
						if (opt == 1) {
							bat.balance();
						} else if (opt == 2) {
							bat.deposit();
						} else if (opt == 3) {
							bat.withDraw();
						} else {
							System.err.println("Invalid Option");
						}
					} else {
						System.err.println("Wrong Password!!!!");
						System.out.println("Try After 5 min");
					}
				}
			}
		} else {
			System.err.println("invalid Email");
			System.out.println("Try Again 2 Attempts left.");
			System.out.print("Enter your Email Id: ");
			String emailid1 = scan.next();
			if (emailid1.endsWith("@gmail.com")) {
				System.out.println();
				System.out.print("Enter your Password : ");
				String password = scan.next();

				if (password.equals("123jhon*")) {
					bat.getPassword();
					int opt = scan.nextInt();
					if (opt == 1) {
						bat.balance();
					} else if (opt == 2) {
						bat.deposit();
					} else if (opt == 3) {
						bat.withDraw();
					}
				}
			} else {
				System.err.println("invalid Email");
				System.out.println("Try Again 1 Attempts left.");
				System.out.print("Enter your Email Id: ");
				String emailid2 = scan.next();

				if (emailid2.endsWith("@gmail.com")) {
					System.out.println();
					System.out.print("Enter your Password : ");
					String password = scan.next();

					if (password.equals("123jhon*")) {
						bat.getPassword();
						int opt = scan.nextInt();
						if (opt == 1) {
							bat.balance();
						} else if (opt == 2) {
							bat.deposit();
						} else if (opt == 3) {
							bat.withDraw();
						}
					}

				} else {
					System.err.println("Invalid Email");
					System.out.println("Try After 5 min");
				}
			}
		}
		scan.close();
	}
}

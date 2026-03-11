package com;

import java.util.Scanner;

public class BankAccountTransaction {

	public void getEmail() {
		System.out.println("Welcome To Bank of CODERS ");
		System.out.println();
		System.out.print("Enter you Email id : ");

	}

	public static void main(String[] args) {

		double balance = 45000;

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

				System.err.println();
				System.out.println("Choose Your Option : \n1 Check Balance \n2 Deposit \n3 Withdraw");
				System.out.print("Your Option : ");
				int opt = scan.nextInt();
				if (opt == 1) {
					System.out.println("Balance : " + balance);
				} else if (opt == 2) {
					System.out.print("Deposit Amount : ");
					double depositAmount = scan.nextDouble();

					double currentBalance = balance + depositAmount;
					System.out.println("Currnt balance after Deposit  : " + currentBalance);
				}

				else if (opt == 3) {
					System.out.println("Withdraw Amount : ");
					double withDraw = scan.nextDouble();
					double currentBalance = balance - withDraw;
					if (withDraw > balance) {
						System.err.println("Insufficent Balance");
					} else {
						System.out.println("Current Balance after Withdraw : " + currentBalance);
					}

				}

			}

			else {
				System.err.println("Wrong Password!!!!");
				System.out.println("Try Again 2 Attempt left");
				System.out.print("Enter your Password : ");
				String password1 = scan.next();
				if (password1.equals("123jhon*")) {
					System.out.println("Login Successful! Welcome to the portal.");

					System.err.println();
					System.out.println("Choose Your Option : \n1 Check Balance \n2 Deposit \n3 Withdraw");
					System.out.print("Your Option : ");
					int opt = scan.nextInt();

					if (opt == 1) {
						System.out.println("Balance : " + balance);
					} else if (opt == 2) {
						System.out.print("Deposit Amount : ");
						double depositAmount = scan.nextDouble();

						double currentBalance = balance + depositAmount;
						System.out.println("Currnt balance after Deposit  : " + currentBalance);
					}

					else if (opt == 3) {
						System.out.println("Withdraw Amount : ");
						double withDraw = scan.nextDouble();
						double currentBalance = balance - withDraw;
						if (withDraw > balance) {
							System.err.println("Insufficent Balance");
						} else {
							System.out.println("Current Balance after Withdraw : " + currentBalance);
						}

					}

				} else {
					System.err.println("Wrong Password!!!!");
					System.out.println("Try Again 1 Attempt left");
					System.out.print("Enter your Password : ");
					String password2 = scan.next();
					if (password2.equals("123jhon*")) {
						System.out.println("Login Successful! Welcome to the portal.");
						System.err.println();
						System.out.println("Choose Your Option : \n1 Check Balance \n2 Deposit \n3 Withdraw");
						System.out.print("Your Option : ");
						int opt = scan.nextInt();

						if (opt == 1) {
							System.out.println("Balance : " + balance);
						} else if (opt == 2) {
							System.out.print("Deposit Amount : ");
							double depositAmount = scan.nextDouble();

							double currentBalance = balance + depositAmount;
							System.out.println("Currnt balance after Deposit  : " + currentBalance);
						}

						else if (opt == 3) {
							System.out.println("Withdraw Amount : ");
							double withDraw = scan.nextDouble();
							double currentBalance = balance - withDraw;
							if (withDraw > balance) {
								System.err.println("Insufficent Balance");
							} else {
								System.out.println("Current Balance after Withdraw : " + currentBalance);
							}

						}

					} else {
						System.err.println("Wrong Password!!!!");
						System.out.println("Try After 5 min");
					}

				}

			}

		} else {
			System.err.println("invalid Email");

		}

	}

}
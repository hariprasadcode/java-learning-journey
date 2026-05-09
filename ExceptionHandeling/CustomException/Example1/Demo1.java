package com.dcl.custom;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Asking user to enter username
		System.out.println("Enter User Name : ");
		String username = sc.next();

		// Asking user to enter password
		System.out.println("Enter Password : ");
		int password = sc.nextInt();

		// Checking whether entered username is correct
		if (username.equals("Smith")) {

			// Checking whether entered password is correct
			if (password == 123) {

				// Login success message
				System.out.println("Login Successful");

			} else {

				// Handling invalid password using custom exception
				try {

					// Creating object of InvalidPasswordException
					InvalidPasswordException e = new InvalidPasswordException();

					// Throwing the exception object
					throw e;

				} catch (InvalidPasswordException e) {

					// Displaying invalid password message
					System.out.println("Invalid Password");
				}
			}

		} else {

			// Handling invalid username using custom exception
			try {

				// Creating object of InvalidUsernameException
				InvalidUsernameException e = new InvalidUsernameException();

				// Throwing the exception object
				throw e;

			} catch (InvalidUsernameException e) {

				// Displaying invalid username message
				System.out.println("invalid Username");
			}
		}
	}
}
package com;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Details");
		
		System.out.print("User Id : ");
		int userId = scan.nextInt();

		System.out.print("Enter Username : ");
		String userName = scan.next();

		System.out.print("Enter Salary : ");
		double salary = scan.nextDouble();
		
		System.out.println();

		System.out.println("User Id : " + userId + "\nUser Name :" + userName + "\nSalary : " + salary);

		scan.close();
	}

}

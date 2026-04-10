//just a simple example for scanner
package com;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome");
		System.out.print("Enter Student Name : ");
		String name = sc.next();

		System.out.print("Enter Roll Number : ");
		int rollNum = sc.nextInt();

		System.out.print("Enter Marks of Mathamatics  : ");
		int mm = sc.nextInt();

		System.out.print("Enter Marks of Science  : ");
		int sm = sc.nextInt();

		System.out.print("Enter Marks of Social  : ");
		int som = sc.nextInt();

		int total = mm + sm + som;
		double avg = total / 3.0;

		System.out.println();
		System.out.println("----Student result----");
		System.out.println();

		System.out.println(
				"Name : " + name + "\nRoll Number : " + rollNum + "\nTotal Marks : " + total + "\nAverage : " + avg);

		if (avg >= 90) {
			System.out.println("Grade : A+");
		} else if (avg >= 75) {
			System.out.println("Grade : A");
		} else if (avg >= 60) {
			System.out.println("Grade :B");
		} else if (avg >= 50) {
			System.out.println("Grade :C");
		} else {
			System.out.println("Fail");
		}

	}

}

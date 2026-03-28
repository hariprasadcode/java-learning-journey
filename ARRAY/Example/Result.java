package com;

import java.util.Scanner;

public class Result {

	int[] totalMarks = { 500, 486, 589, 398, 512 };

	public void checking() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();

		System.out.println("Enter Name : ");
		String name = sc.next();

		if (id == 101 && name.equals("Ram")) {
			System.out.println("Total Mark : " + totalMarks[0]);
		} else if (id == 102 && name.equals("William")) {
			System.out.println("Total Mark : " + totalMarks[1]);
		} else if (id == 103 && name.equals("Robert")) {
			System.out.println("Total Mark : " + totalMarks[2]);
		} else if (id == 104 && name.equals("Jhon")) {
			System.out.println("Total Mark : " + totalMarks[3]);
		} else if (id == 105 && name.equals("Sham")) {
			System.out.println("Total Mark : " + totalMarks[4]);
		} else {
			System.out.println("Invalid!!");
		}
	}

	public static void main(String[] args) {
		Result r = new Result();
		r.checking();
	}
}

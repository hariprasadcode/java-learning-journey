/*Task 1 – Student Information System

Use variables, object creation, and methods


Create these variables:
Student Name
USN
Branch
Marks in 3 subjects

Methods you must create

1️⃣ Without argument, without return

Print welcome message


2️⃣ With argument, without return

Print student details


3️⃣ Without argument, with return

Return college name


4️⃣ With argument, with return

Calculate average marks  */

package com;

public class Student {

	String studentName;
	String usn;
	String branch;

	public void welcome() {
		System.out.println("Welcome To Student Portal");
	}

	public void stuDetails(String studentName, String usn, String branch) {
		System.out.println("Student Name : " + studentName);
		System.out.println("USN : " + usn);
		System.out.println("Branch : " + branch);
	}

	public String collegeName() {
		return "Srinivas University";
	}

	public double average(int s1, int s2, int s3) {
		double avg = (s1 + s2 + s3) / 3;
		return avg;
	}

	public static void main(String[] args) {

		Student stu = new Student();

		stu.welcome();
		System.out.println("     ");

		String result = stu.collegeName();
		System.out.println("College : " + result);

		System.out.println("     ");

		stu.stuDetails("Ram", "01SU22CS001", "CSE");

		System.out.println("     ");
		double avg = stu.average(90, 94, 98);
		System.out.println("Average Marks : " + avg);

	}
}

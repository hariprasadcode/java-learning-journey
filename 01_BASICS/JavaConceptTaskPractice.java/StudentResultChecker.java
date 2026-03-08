/*Task 3 – Student Pass/Fail Checker

Create a method:

CheckResult(int marks)

Condition:

marks >= 35 → Pass
marks < 35 → Fail

This method should be
with argument and without return type */

package com;

public class StudentResultChecker {

	public void checkResult(int mark) {
		if (mark >= 35) {
			System.out.println("Mark : "+mark);
			System.out.println("Student Result : Pass");
		} else {
			System.out.println("Mark : "+mark);
			System.out.println("Student Result : Fail");
		}
	}

	public static void main(String[] args) {

		StudentResultChecker src = new StudentResultChecker();
		src.checkResult(90);

	}

}

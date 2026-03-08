package com;

public class NumberAnalyzer {

	public void welcome() {
		System.out.println("Welcome to number analyser");
	}

	public void number(int num) {
		System.out.println("Number is " + num);
	}

	public int even(int num) {
		if (num % 2 == 0) {
			System.out.println("The Number is Even");
		} else {
			System.out.println("The number is odd");
		}
		return num;
	}

	public void posNeg(int num) {
		if (num >= 0) {
			System.out.println("The Number is Positive");
		} else {
			System.out.println("The number is Negative");
		}
	}

	public void large(int num) {
		if (num >= 100) {
			System.out.println("The Number Is Large");
		} else {
			System.out.println("The Number Is Small");

		}
	}

	public void mul(int num) {
		if (num % 5 == 0) {
			System.out.println("Its a Multiple of 5");
		} else {
			System.out.println("Its Not a Multiple of 5");

		}
	}

	public static void main(String[] args) {

		NumberAnalyzer na = new NumberAnalyzer();

		na.welcome();
		System.out.println();

		na.number(120);
		System.out.println();

		na.even(120);

		na.posNeg(120);

		na.large(120);

		na.mul(120);
	}
}

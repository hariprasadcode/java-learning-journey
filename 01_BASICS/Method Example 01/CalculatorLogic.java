package com;

class CalculatorLogic {

	// without argument without return statement
	public void message() {
		System.out.println("****************************");
		System.out.println("WELCOME TO CALCULATOR WORLD");
	}

	// with argument without return statement
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b +"is = "+ sum);
	}

	// with argument without return statement
	public void sub(int a, int b) {
		int diff = a - b;
		System.out.println("The difference is = " + diff);
	}

	// without argument with return statement

	public int mul() {
		int a = 18;
		int b = 24;
		int result = a * b;
		return result;
	}

	// with argument with return statement

	public double div(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}
	// with argument with return statement

	public double mod(double num3, double num4) {
		double mod = num3 % num4;
		return mod;
	}
}


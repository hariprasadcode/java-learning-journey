/*Task 2 – Simple Calculator

Use methods + arguments + return values

Create methods for:
Addition
Subtraction
Multiplication
Division

Rules:
All methods should be with argument and with return type */
package com;

public class SimpleCalculator {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int sub(int c, int d) {
		int dif = c - d;
		return dif;
	}

	public int mul(int e, int f) {
		int pro = e * f;
		return pro;
	}

	public int div(int g, int h) {
		int quo = g / h;
		return quo;
	}

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();

		int sum = sc.add(12, 78);
		System.out.println("The Sum is = " + sum);

		int dif = sc.sub(12, 78);
		System.out.println("The Difference is = " + dif);

		int pro = sc.mul(12, 78);
		System.out.println("The Product is = " + pro);

		int quo = sc.div(12, 78);
		System.out.println("The Quotient is = " + quo);

	}
}

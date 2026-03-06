package com;

class MrthodLogic {
    // without argument without return statement
	public void m1() {
		System.out.println("Learning Java");
	}
    // with argument without return statement
	public void m2(int a, int b) {
		int sum = a + b;
		System.out.println("the sum = " + sum);
	}
	// without argument with return statement
	public String m3() {
		return "welcome to Dhee Coding Lab";
	}
    //  with argument with return statement
	public double m4(double a, double b) {
		double sub = a - b;
		return sub;
	}
}

package com;

class ShapeAreaCalculator {

	public void area(double r) {
		double area = 3.14 * r * r;
		System.out.println("Area of Circle : " + area);
	}

	public void area(double l, double b) {
		double area = l * b;
		System.out.println("Area of Rectangle : " + area);
	}

	public void area(int b, int h) {
		double area = b * h;
		System.out.println("Area of Triangle : " + area);
	}

	public void area(int side) {
		double area = side * side;
		System.out.println("Area of Square : " + area);
	}

}

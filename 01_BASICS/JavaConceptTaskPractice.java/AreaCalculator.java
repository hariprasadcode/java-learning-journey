/*Task 4 – Area Calculator 
 
Create methods to calculate:
Area of Circle
Area of Rectangle
Area of Triangle
Use different method types  */

package com;

public class AreaCalculator {

	public void circle(double r) {
		double ac = 3.14 * r * r;
		System.out.println("Area of Circle is : " + ac);
	}

	public String rectangle(double len, double bre) {
		double ar = len * bre;
		return "Area of Rectangle is : " + ar;
	}

	public String triangle(double base, double height) {
		double at = 0.5 * base * height;
		return "Area of Triangle is : " + at;
	}

	public static void main(String[] args) {

		AreaCalculator a = new AreaCalculator();

		a.circle(15.98);

		String ar = a.rectangle(89.9, 023.4);
		System.out.println(ar);

		String at = a.triangle(56.78, 1.1);
		System.out.println(at);


	}

}

package com;

public class App {

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();

		m.mo();

		m.mo("JAVA");

		m.mo("Method Overloading", 2);

		m.mo(52, "Core Java");

		String result = m.mo(55);
		System.out.println(result);
	}

}

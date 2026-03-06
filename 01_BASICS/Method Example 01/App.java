package com;

public class App {

	public static void main(String[] args) {
		CalculatorLogic logic = new CalculatorLogic();

		logic.message();
		logic.add(23, 32);
		logic.sub(15, 12);
		
		logic.mul();
		int result1 = logic.mul();
		System.out.println(result1);
		
		
		double result2=logic.div(15,35);
		System.out.println(result2);
		
		double result3=logic.mod(0.2 , 0.5);
		System.out.println(result3);
		

	}

}

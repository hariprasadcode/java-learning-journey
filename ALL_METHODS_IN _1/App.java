package com;

class App {
	
	public static void main(String[] args) {
		MrthodLogic logic = new MrthodLogic();
		
		logic.m1();
		logic.m2(23, 32);
		logic.m3();
		String result1=logic.m3();
		System.out.println(result1);
		
		double result2 = logic.m4(1.0 , 2.0 );{
		System.out.println(result2);
			
		}
	}

}

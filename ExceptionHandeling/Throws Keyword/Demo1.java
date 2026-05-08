package com.dcl.throws_keyword;

public class Demo1 {
	static void print() throws ArithmeticException
	{
      System.out.println(10/0);		
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		try {
		print();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}

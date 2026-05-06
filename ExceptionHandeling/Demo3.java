package com;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			int[] a= {10,20,30,40,50};
		    System.out.println(a[10]);//jump to the respective catch block
		    System.out.println(10/0);// does not execute
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
		catch(ArithmeticException e) {
			System.out.println("invalid decimal");
		}
		System.out.println("end");
	}

}

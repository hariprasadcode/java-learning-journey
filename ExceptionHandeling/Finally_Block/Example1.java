package com.dcl.finally_block;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("connection Built");
		try {
		System.out.println(30/0);
		}
		catch(NullPointerException e) {
			System.out.println("nullvalue");
		}
		
		finally {
			System.out.println("Connection Lost");
		}
		
		System.out.println("end");
	}

}

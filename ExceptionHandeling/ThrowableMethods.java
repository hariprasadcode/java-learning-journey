package com;

public class ThrowableMethods {
	public static void main(String[] args) {
		System.out.println("start");
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}

}

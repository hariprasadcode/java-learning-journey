package com;

public class Son extends Father {
	
	public void result() {
		int total=a-b;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Son s= new Son();
		s.result();
	}
	

}

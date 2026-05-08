package com.dcl.throws_keyword;

public class Demo2 {
	
	static void display() throws InterruptedException
	{
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}

	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
		display();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}

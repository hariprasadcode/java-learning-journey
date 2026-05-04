package com;

public class Demo2 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println("Start");
		try {
	    System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("Invalid Index");
		}
		System.out.println("End");
       }
	}

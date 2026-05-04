package com;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("START");
	System.out.print("Enter a Value for A: ");
	int A= sc.nextInt();
	System.out.print("Enter a value for B: ");
	int B=sc.nextInt();
	try {
	System.out.println(A/B);
	}
	catch(ArithmeticException e){
		System.out.println("Dont diveide by Zero ");
	}
	System.out.println("END");
}
}

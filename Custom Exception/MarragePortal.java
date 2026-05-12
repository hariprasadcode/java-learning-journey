package com.dcl.custom.message;

import java.util.Scanner;

public class MarragePortal {
	public static void main(String[] args) {
		System.out.println("START");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age=sc.nextInt();
		
		if(age>=21) {
			System.out.println("Get Married");
		}
		else {
			try {
			throw new InvalidAgeException("have patience you are not yet 21 ");
			}
			catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
				
			}
		}
		System.out.println("END");
		
	}

}

//used scanner, array and for each .its just an example 
package com;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int[] marks=new int[6];
		System.out.print("English : ");
		marks[0]=scan.nextInt();
		
		System.out.print("Kannada : ");
		marks[1]=scan.nextInt();
		
		System.out.print("Hindi : ");
		marks[2]=scan.nextInt();
		
		System.out.print("Science : ");
		marks[3]=scan.nextInt();
		
		System.out.print("Maths : ");
		marks[4]=scan.nextInt();
		
		System.out.print("Socal: ");
		marks[5]=scan.nextInt();
		
		double sum=0;
		for(int m:marks) {
			sum+=m;
		}
		
		double avg=sum/6;
		System.out.println("Average : "+avg);
		
		
	}

}

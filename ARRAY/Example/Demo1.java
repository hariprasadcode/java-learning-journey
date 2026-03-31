package com;
/*Here we learned about the array and its different ways of declaration initializations */
public class Demo1 {
	
	public static void main(String[] args) {
		//Array declaration
		int[] age;
		
		//Creating Array
		age= new int[3];
		
		//initialization and creation together
		int[] mark =new int[3];
		
		//initialization
		age[0]=18;
		age[1]=19;
		age[2]=19;
		
		mark[0]=55;
		mark[1]=67;
		mark[2]=80;
		
		//Array Declaration , creation , initialization  all Together
		String[] name = {"jhon","william","robert"} ;
		
		
		//printing 
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println();
		System.out.println(mark[0]);
		System.out.println(mark[1]);
		System.out.println(mark[2]);
		System.out.println();
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
	}

}

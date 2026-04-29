package com;

public class Demo {

	public static void main(String[] args) {
		 String s1=new String("Java");
		 String s2=new String("Java");
		 
		 /* No need to override toString() because it is already overridden in the String class */
		 System.out.println(s1);
		 System.out.println(s2);
		 
		 /* No need to override equals() because it is already overridden in the String class */
		 System.out.println(s1.equals(s2));
	}
}

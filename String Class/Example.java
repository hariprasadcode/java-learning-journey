package com;

public class Example {
	public static void main(String[] args) {
		String s1= "java";
		String s2="java";
		
		String s3=new String("java");
		String s4=new String("java");
		
		/*String objects created  as literal are created in scp
		 * as one single copies
		 * multiple ref can point to them*/
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
	}

}

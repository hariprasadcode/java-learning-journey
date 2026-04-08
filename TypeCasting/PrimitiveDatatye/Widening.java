package com.dcl;

public class Widening {
	public static void main(String[] args) {
		byte a =10;
		System.out.println("a: "+a);
		int b=a;
		System.out.println("b: "+b);

		
		short c=20;
		System.out.println("c: "+c);
		float d=c;
		System.out.println("d: "+d);

		
		long e=1234567898765432L;
		System.out.println("e: "+e);
		double f=e;
		System.out.println("f: "+f);

		/*special type for char
		 * even it is widening we need to use type casting operator 
		 * this only if we want to convert into char*/
		byte g=45;
		System.out.println("g: "+g);
		char h=(char)g;
		System.out.println("h: "+h);

		
		char i='@';
		System.out.println("i: "+i);
		long j=i;
		System.out.println("j: "+j);

	}

}

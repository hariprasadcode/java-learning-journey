package com.example3;

public class PrimeMinister {

	private static PrimeMinister pm;
	
	/*if i want to print name and term need to change the return typr of helper method*/
	String name="Modhi";
	int term=3;
	
	private PrimeMinister() {
		System.out.println("Elected");
	}
	
	public static PrimeMinister pmElected() {
		if( pm==null);
		pm=new PrimeMinister();
		return pm;
		}
	
}

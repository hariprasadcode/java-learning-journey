package com.dcl;

public class CollegeApp {
	public static void main(String[] args) {
		College c1 = new College();
		c1.setId(101);
		c1.setName("IISCE");
		c1.setUniversity("VTU");
		c1.setPrincipal("Thomas");
		c1.setFee(1000000.0);
		
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getUniversity());
		System.out.println(c1.getPrincipal());
		System.out.println(c1.getFee());
		
	}

}

package com.dcl;

public class AadharCard {
	
	String name;
	long aadharNo;
	public AadharCard(String name, long aadharNo) {
		this.name = name;
		this.aadharNo = aadharNo;
	}
	
	@Override
	public int hashCode() {
		Long l=aadharNo;
		return l.hashCode();
	}
	

}

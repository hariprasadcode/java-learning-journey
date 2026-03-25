package com;

public class Bike extends Vehicle{
	
	int gare;
	
	public void gareChange(int gare) {
		System.out.println("gare "+gare);
	}
	public void bikeDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("Speed : "+speed);
	}

}

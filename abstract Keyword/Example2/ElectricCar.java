package com.hp.examples;

//concrete class 
public class ElectricCar extends Car{
	
	//override the parent abstract class
	@Override 
	void start() {
		System.out.println("EV is starting");
	}
    
	@Override
	void stop() {
		System.out.println("EV is stoped");
	}

}

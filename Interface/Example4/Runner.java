package com.dcl.example3;

public class Runner {

	public static void main(String[] args) {
		Mobile m= new Mobile();
		m.powerOn();  \\extended from ElectricDevice class
		m.clickPhoto(); \\from camera interface 
		m.playMusic();    \\from musicplayer interface
		m.powerOff();      \\from ElectricDevice class
		
	}
}

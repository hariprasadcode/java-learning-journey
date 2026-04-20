package com.dcl.example3;

public class Mobile extends ElectronicDevice implements Camera , MusicPlayer{

	@Override
	public void clickPhoto() {
		System.out.println("Clicking photo from mobile");
	}
	@Override
	public void playMusic() {
		System.out.println("Playing music from mobile");
	}
}

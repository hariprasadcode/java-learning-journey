package com;

class ElectricBike extends Bike {

	int battery;

	public void electricBikeDetails() {
		System.out.println("Batery : " + battery);
	}

	public static void main(String[] args) {
		ElectricBike ev = new ElectricBike();

		ev.brand = "OLA";
		ev.speed = 80;

		ev.start();

		System.out.println("-----------");

		ev.bikeDetails();

		ev.gareChange(2);

		System.out.println("-----------");

		ev.electricBikeDetails();

		System.out.println("-----------");

		ev.stop();
	}

}

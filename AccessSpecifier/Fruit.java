package com.dcl;
/*Accessing a default members in the same class*/
 class Fruit {
	
	int price=500;
	
	Fruit(){
		System.out.println("inside a constructor");
	}
	
	void sell() {
		System.out.println("50kg sale");
	}
	public static void main(String[] args) {
		Fruit f1=new Fruit();
		System.out.println(f1.price);
		f1.sell();
	}

}

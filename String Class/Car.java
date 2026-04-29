package com;

public class Car {
public static void main(String[] args) {
	Car c1=new Car();
	Car c2=new Car();
	/*we get the Address because we didnt override the toString() */
	System.out.println(c1);
	System.out.println(c2);
	/*It compares the address of the object because we didnt override the equal() method */
	System.out.println(c1.equals(c2));
}
}

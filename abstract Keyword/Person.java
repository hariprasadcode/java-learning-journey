//example to shoe cannot have abstract method inside concrete class
package com.hp;
//concrete class
public class Person {
	
	//concrete method 
	public void work() {
		System.out.println("working");
	}
	//abstract method
	//we cannot have abstract method inside a concrete class
	public abstract void eat();
}

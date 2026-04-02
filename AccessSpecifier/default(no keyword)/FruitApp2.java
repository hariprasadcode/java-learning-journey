package com.dcl.demo;

/*accessing default(no keyword) members from the different class ,
 * also different package
 * which is not possible */
import com.dcl.Fruit;

public class FruitApp2 {
public static void main(String[] args) {
	Fruit f1=new Fruit();
	System.out.println(f1.price);
	f1.sell();
}
}

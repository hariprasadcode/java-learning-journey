package set.examples;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		
		/*Performs insertion Order*/
		lhs.add("java");
		lhs.add(10);
		lhs.add(null);
		lhs.add(true);
		lhs.add(20.20);
		
		System.out.println(lhs);
		
		for(Object o : lhs) {
			System.out.println(o);
		}
		
	}

}

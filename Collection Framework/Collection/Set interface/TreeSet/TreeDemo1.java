package set.examples;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet<String> hs= new TreeSet<String>();
		hs.add("Apple");
		hs.add("Dog");
		hs.add("Ball");
		hs.add("Cat");


	
		System.out.println(hs.size()); 
		
		System.out.println(hs);
		
		for(Object o : hs) {
			System.out.println(o);
		}
	}

}

package set.examples;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet hs= new TreeSet();
		hs.add("fghg");
		hs.add("jav");
		hs.add("a");
		hs.add("ab");


	
		System.out.println(hs.size()); 
		
		System.out.println(hs);
		
		for(Object o : hs) {
			System.out.println(o);
		}
	}

}

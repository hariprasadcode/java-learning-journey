package set.examples;

import java.util.TreeSet;

public class TreeSetBoolean {
	public static void main(String[] args) {
		TreeSet<Boolean> hs= new TreeSet<Boolean>();
		hs.add(true);
		hs.add(false);
		hs.add(false);
		hs.add(true);


	
		System.out.println(hs.size()); 
		
		System.out.println(hs);
		
		for(Object o : hs) {
			System.out.println(o);
		}
	}

}

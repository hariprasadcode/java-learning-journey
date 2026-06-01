package set.examples;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("java");
		hs.add(10);
		hs.add(20.20);
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		
		for(Object o:hs) {
			System.out.println(o);
		}
	}

}

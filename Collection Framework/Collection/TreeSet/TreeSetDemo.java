package set.examples;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(10);
		ts.add(1);
		ts.add(40);
		ts.add(100);
		
		System.out.println(ts);
		
		for(Object o : ts) {
			System.out.println(o);
		}
		
		
	}

}

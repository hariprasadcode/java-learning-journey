package list.linkedlist;

import java.util.*;

public class Demo5 {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("jhon");
		al.add(24);
		al.add("benglore");
		al.add(5.9);
		
		System.out.println(al);
		//al.removeAll(al);
		//System.out.println(al);
		
		LinkedList ll=new LinkedList();
		ll.addAll(al);
		System.out.println(al.containsAll(ll));
		System.out.println(al.get(1));
		
				
		}

}

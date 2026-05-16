package list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo2 {
	public static void main(String[] args) {
ArrayList al= new ArrayList();
		
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println("ArrayList : "+ al+" Size : "+al.size());
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.addAll(al);
		ll.add(50);
		
		System.out.println("LinkedList : "+ ll+" Size : "+ll.size());
		
		System.out.println("--------------");
		
		System.out.println(ll.containsAll(al));
		ll.remove(1);
		System.out.println(ll.containsAll(al));
		
		System.out.println("---------------");
		
	}

}

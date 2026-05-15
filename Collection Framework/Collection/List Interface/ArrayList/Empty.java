package arraylist;

import java.util.ArrayList;

public class Empty{
	public static void main(String[] args) {
		//created an arraylist
		ArrayList list1=new ArrayList();
		
		/*Adding elements inside arraylist using methods add()*/
		list1.add(10);
		list1.add("Java");
		list1.add(10.90);
		list1.add(10);//allows duplicate values also
		list1.add(30);
		list1.add(30);
		
		/*isEmpty() returns true if its empty else return false*/
		System.out.println(list1.isEmpty());
		
		/*clear() method is used to delete/remove all the elemet from the list*/
		list1.clear();
		System.out.println(list1.isEmpty());

		
		
		
	}

}

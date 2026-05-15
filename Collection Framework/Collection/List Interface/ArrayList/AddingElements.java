package arraylist;

import java.util.ArrayList;

public class AddingElements{
	public static void main(String[] args) {
		//created an arraylist
		ArrayList list1=new ArrayList();
		
		/*Adding elements inside arraylist using methods add()*/
		list1.add(10);
		list1.add("Java");
		list1.add(10.90);
		list1.add(10);//allows duplicate values also
		
		System.out.println(list1);
		
		/*Adding elements at 1st  */
		list1.addFirst(20);
		System.out.println(list1);
		
		/*Adding elements at end*/
		list1.addLast(20);
		System.out.println(list1);
		
		/*Adding element on a perticular index*/
	    list1.add(5, 6);
	    System.out.println(list1);	
	}

}

package arraylist;

import java.util.ArrayList;

public class Index{
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

		
		/*indexOf() return the first appeared index position of the element*/
		System.out.println(list1.indexOf(10));
         System.out.println(list1.indexOf(30));
         
         System.out.println("------------");
         
         System.out.println(list1.lastIndexOf(30));
         System.out.println(list1.lastIndexOf(10));
		
		
	}

}

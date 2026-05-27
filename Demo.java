package generics;

import java.util.*;

public class Demo {
	public static void main(String[] args) {

		/* Arraylist Without Generics */
		ArrayList al1 = new ArrayList();
		al1.add("Java");
		al1.add(1.5);
		al1.add(true);
		System.out.println(al1);
		System.out.println();

		/* Arraylist with Generics */
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("HTML");
		al.add("Css");
		al.add("Spring");

		System.out.println(al);

		/* using for loop */
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		/* Using for each loop */
		for (String s : al) {
			System.out.println(s);
		}

	}

}

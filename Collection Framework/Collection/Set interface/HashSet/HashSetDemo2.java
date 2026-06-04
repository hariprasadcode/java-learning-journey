package set.examples;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		/*Hash-code value of the value are taken using the hashCode() 
		 * and then the mod is calculated with the current capacity of the
		 * hashCode , using the output the object is pushed to the respective bucket
		 * and later the equals() comes into picture and checks if the object is a unique
		 *  value to be stored in the respective bucket no other buckets will be checked
		 *   while doing this operation
		 **/
		String color1="blue";
		int blueHashCode=color1.hashCode();
		System.out.println(blueHashCode);
		System.out.println(blueHashCode%16);
		
		String color2="brown";
		int brownHashCode=color2.hashCode();
		System.out.println(brownHashCode);
		System.out.println(brownHashCode%16);
		
		String color3="red";
		int redHashCode=color3.hashCode();
		System.out.println(redHashCode);
		System.out.println(redHashCode%16);
		
		HashSet<String> hs= new HashSet();
		
		hs.add(color1);
		hs.add(color2);
		hs.add(color3);
		hs.add(null);
		hs.add(color3);//ignored because its dublicate
		
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		
		
		
	}

}

package map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HomogenousDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> players= new HashMap<>();
		players.put(18, "virat");
		players.put(7, "Dhoni");
		players.put(10, "sachin");
		players.put(17, "ABD");
		players.put(19, "ABD");
		
		System.out.println(players);
		System.out.println("---------");
        System.out.println(players.size());//returns the int value , the size of key-value pairs present .
		System.out.println("---------");
		System.out.println(players.get(18));//returns the value of respective key
		System.out.println(players.get(7));
		System.out.println(players.get(17));
		System.out.println(players.get(333));
		System.out.println("---------");

		System.out.println(players);
		players.remove(19);//removes the key-value pair from the HashMap
		System.out.println(players);
		System.out.println("---------");
		System.out.println(players.containsKey(7));//checks weather it contains key called 7 and returns boolean value
		System.out.println(players.containsKey(333));
		System.out.println("---------");

		System.out.println(players.containsValue("virat"));// checkes weather it contains value called virat and returns boolean value
		System.out.println(players.containsValue("hardik"));
		System.out.println("---------");
		
		//storing the values inside the collection and itterating
		Collection<String> names=players.values();
		for(String s: names) {
			System.out.println(s);
		}
		System.out.println("---------");
		
		//storing the keys inside the set and itterating
		Set<Integer> number=players.keySet();
		for(int n:number) {
			System.out.println(n+"---->"+players.get(n));
			
		}
		System.out.println("---------");
		
		//ckecking weather the HashMap is empty or no and it returns a boolean value
		System.out.println(players.isEmpty());
		System.out.println("---------");
		players.clear();// removing all the key-value pairs from the HashMap 
		System.out.println(players.isEmpty());
		System.out.println("---------");


	}

}

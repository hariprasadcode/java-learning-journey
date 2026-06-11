package map.hashmap;

import java.util.HashMap;

public class HeterogenousDemo {
	public static void main(String[] args) {
		HashMap hm= new HashMap();
		System.out.println(hm.put(12.8, false));
		System.out.println(hm.put("A", 45.6));
		System.out.println(hm.put(null, 'D'));
		System.out.println(hm.put(101, "Tom"));
		System.out.println(hm.put(101, "sam"));
		System.out.println(hm.put(101, "jerry"));
		
		System.out.println(hm);

	}

}

package generics;
import java.util.*;
public class PlayerApp {
	public static void main(String[] args) {
		Player p1= new Player("Virat", "RCB", "India", "19cr");
		Player p2= new Player("Rohit", "MI", "India", "20cr");
		Player p3= new Player("Dhoni", "CSK", "India", "21cr");
		Player p4= new Player("Hardhik", "MI", "India", "15cr");
		Player p5= new Player("Jadeja", "RR", "India", "12cr");
		
		LinkedList<Player> pList= new LinkedList<Player>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pList.add(p5);
		
		for(Player p: pList) {
			System.out.println(p);
		}


		
	}

}

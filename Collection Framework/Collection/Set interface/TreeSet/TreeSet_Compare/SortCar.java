package treeset.compare;

import java.util.TreeSet;

public class SortCar {
	public static void main(String[] args) {
		
		Car c1= new Car(1000);
		Car c2= new Car(6000);
		Car c3= new Car(500);
		
		TreeSet <Car> ts = new TreeSet<>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		
		for(Car c:ts) {
			System.out.println(c);
		}
		
		
		

		
	}

}

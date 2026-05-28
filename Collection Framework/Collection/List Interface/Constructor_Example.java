package vector;
import java.util.*;
public class Constructor_Example {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		System.out.println(x);
		
		LinkedList y= new LinkedList(x);
		y.add(20);
		y.add(30);
		System.out.println(y);
		
		Vector z= new Vector(y);
		z.add(40);
		z.add(50);
		System.out.println(z);
		
		
		
	}

}

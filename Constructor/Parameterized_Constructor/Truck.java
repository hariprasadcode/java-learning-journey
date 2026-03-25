package dom;
// example for custom parameterized constructor.
public class Truck {
	
	String model;
	String brand;
	double price;
	
	Truck(String m , String b, double p ){
		model=m;
		brand=b;
		price=p;
	}
	public static void main(String[] args) {
		Truck t1=new Truck("A1", "TATA", 2000000);
		System.out.println(t1.model);
		System.out.println(t1.brand);
		System.out.println(t1.price);
		
		Truck t2=new Truck("A2", "TATA", 2500000);
		System.out.println(t2.model);
		System.out.println(t2.brand);
		System.out.println(t2.price);

		
	}

}

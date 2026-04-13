package compiletime;
//Class demonstrating Compile-Time Polymorphism
public class Product {
	//Method 1 no parameter
	public void buy() {
		System.out.println("Product Purchased");
	}
	//Method 2 one parameter int
	public void buy(int price) {
		System.out.println("Product Price"+price);
	}
	//Method 3 one parameter String
	public void buy(String name) {
		System.out.println(name+" Product Purchased");
	}
	//Method 4 two Parameters String and int
	public void buy(String name,int price) {
		System.out.println("Paid"+price+"for"+name);
	}

}

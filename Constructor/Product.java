package constructor_overloading;

class Product {

	Product() {
		System.out.println("Hello There");
	}

	Product(int a) {
		System.out.println(a);
	}

	Product(double a) {
		System.out.println(a);
	}

	Product(int a, String b) {
		System.out.println(a + b);
	}

	Product(String a, int b) {
		System.out.println(b + a);
	}

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product(1);
		Product p3 = new Product(0);
		Product p4 = new Product(2, "hp");
		Product p5 = new Product("hp", 4);

	}

}

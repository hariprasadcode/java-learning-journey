package demo1;

class MethodExample4 {
	// with argument with return statement

	public int mul(int a, int b) {
		int product = a * b;
		return product;
	}

	public String details(String name, String city) {
		return (name + " Beelongs To " + city);
	}

	public static void main(String[] args) {
		MethodExample4 m4 = new MethodExample4();

		int result = m4.mul(14, 90);
		System.out.println(result);
		System.out.println(m4.details("Jhon", "Manglore"));
	}

}

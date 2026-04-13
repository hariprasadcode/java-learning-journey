package compiletime;

public class App {
	public static void main(String[] args) {
		//Creating object of Product Class
		Product p= new Product();
		
        // Method call:
        // Compiler decides WHICH buy() method to call
        // based on arguments passed at compile time
		
		p.buy("shoe");
		// Calls: buy(String name)
	}

}

package runtime;

public class App {

	public static void main(String[] args) {
		// Upcasting:
        // Reference type is Vehicle (parent)
        // Object type is Car (child)
		Vehicle v=new Car();
		
		// Runtime Polymorphism happens here:
        // Method call is decided at runtime (not compile time)
        // Even though reference is Vehicle,
        // JVM calls Car's start() method because object is Car
		v.start();//method call
	}
}

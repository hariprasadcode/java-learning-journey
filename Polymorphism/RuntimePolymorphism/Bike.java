package runtime;
//child class 
public class Bike extends Vehicle {
    //overriding a parent class
	@Override
	public void start() {
		System.out.println("bike is starting");
	}
}

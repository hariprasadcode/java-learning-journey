package runtime;

//sub class(child class)
public class Car extends Vehicle {
	//overriding a method of parent class
	@Override
	public void start() {
		System.out.println("car is starting");
	}

}

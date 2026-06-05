package treeset.compare;

public class Car implements Comparable<Car> {
	
	int price;

	public Car(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "price:"+this.price;
		
	}
	@Override
	public int compareTo(Car anotherCar) {
		return this.price-anotherCar.price;
	}
	


}

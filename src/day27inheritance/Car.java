package day27inheritance;

public class Car extends Whicle {
	
	public Car() {
		super(2);
		System.out.println("car constructor");
	}
	public Car(String name) {
		this();
		System.out.println("Car");
	}

	public static void main(String[] args) {
		Car car = new Car("Volvo");
		

	}

}

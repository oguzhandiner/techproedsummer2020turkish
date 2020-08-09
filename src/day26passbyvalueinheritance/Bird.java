package day26passbyvalueinheritance;

public class Bird extends Animal {

	public static void main(String[] args) {
		Bird objectBird = new Bird();
		objectBird.eat();
		objectBird.drink();
		objectBird.fly();

	}
	
	public static void fly() {
		System.out.println("ucarlar");
	}

}

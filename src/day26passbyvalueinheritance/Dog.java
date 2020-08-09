package day26passbyvalueinheritance;

public class Dog extends Mammal {
	public static void main(String[] args) {
		Dog objectDog = new Dog();
		objectDog.eat();
		objectDog.feed();
		objectDog.drink();
		objectDog.bark();
		objectDog.smell();
		
	}
	
	public static void bark() {
		System.out.println("iyi havlarlar");
	}
	
	public static void smell() {
		System.out.println("iyi koku alirlar");
	}

}

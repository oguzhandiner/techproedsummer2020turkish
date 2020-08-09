package day26passbyvalueinheritance;

public class Mammal extends Animal {
	public static void main(String[] args) {
		
		Mammal objectMammal = new Mammal();
		
		objectMammal.drink();
		objectMammal.eat();
		objectMammal.feed();

	}

	public static void feed() {
		System.out.println("yavrularini beslerler");
	}

}

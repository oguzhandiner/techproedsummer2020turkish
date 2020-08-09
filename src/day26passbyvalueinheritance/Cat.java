package day26passbyvalueinheritance;

public class Cat extends Mammal {

	public static void main(String[] args) {

		Cat objectCat = new Cat();
		objectCat.eat();
		objectCat.drink();

	}

	public static void meow() {
		System.out.println("Miyavlarlar");
	}

	public static void clean() {
		System.out.println("Temizlenirler");
	}

}

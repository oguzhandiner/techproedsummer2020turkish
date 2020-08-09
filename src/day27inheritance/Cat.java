package day27inheritance;

public class Cat extends Mammal {
	
	public Cat () {
		System.out.println("cat constructor");
	}

	public static void main(String[] args) {

		Cat object = new Cat();
		object.clean();
		object.feed();
		object.meow();

	}

	public void meow() {
		System.out.println("miyavlarlar");
	}

	public void clean() {
		System.out.println("kendilerini temizler");
	}

}

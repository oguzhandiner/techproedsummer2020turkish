package day27inheritance;

public class Dog extends Mammal {

	public boolean loyal = true;
	
	public Dog() {
		System.out.println("Dog constructor");
	}

	public static void main(String[] args) {

		Dog obj = new Dog();
		obj.bark();
		obj.feed();
		obj.smell();
		System.out.println(obj.loyal);
		System.out.println(obj.age);

	}

	public void bark() {
		System.out.println("havlarlar");
	}

	public void smell() {
		System.out.println("iyi koku alirlar");
	}
}

package day28overridding;

public class Dog extends Animals {
	
	/*
	 * Parent'da ki method'u method signature'sini degistirmeden body'sini
	 * degistirerek child class'ta kullanmaya "Method Overridding" denir.
	 */

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.numOffoot();

	}
	
	public void sound() {
		System.out.println("havlar");
	}

	@Override
	public void numOffoot() {
		System.out.println("dort ayaklari vardir");
	}

}

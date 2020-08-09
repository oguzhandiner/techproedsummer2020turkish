package day28overridding;

public class Cat extends Animals {

	public static void main(String[] args) {
		Cat object = new Cat();
		object.sound();
		object.numOffoot();

	}

	public void sound() {
		System.out.println("miyavlarlar");
	}

	@Override
	public void numOffoot() {
		System.out.println("dort ayaklari vardir");
	}
	
	

}

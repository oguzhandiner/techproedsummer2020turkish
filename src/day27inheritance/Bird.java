package day27inheritance;

public class Bird extends Animals {
	
	public Bird() {
		System.out.println("bird constructor");
	}

	public static void main(String[] args) {

		Bird obj = new Bird();
		obj.fly();
		obj.tweet();
		obj.nest();

	}

	public void fly() {
		System.out.println("ucarlar");
	}

	public void tweet() {
		System.out.println("oterler");
	}

	public void nest() {
		System.out.println("yuva yaparlar");
	}

}

package day27inheritance;

public class MammalQuestion {
	
	private static int age;

	public MammalQuestion(int age) {
		super();
		System.out.println("child constructor called by this");
	}
	public MammalQuestion() {
		this(age = 11);
		System.out.println("child constructor");
	}
	
	public static void main(String[] args) {
		
		MammalQuestion Mammal = new MammalQuestion();
		
	}

}

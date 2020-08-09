package day27inheritance;

public class Animals {
	
	public int age = 1;
	
	public Animals() {
		System.out.println("animals");
	}

	public static void main(String[] args) {
		
		Animals obj = new Animals();
		System.out.println(obj.age);
		

	}
	public void drink() {
		System.out.println("icerler");
	}
	public void eat () {
		System.out.println("yerler");
	}

}

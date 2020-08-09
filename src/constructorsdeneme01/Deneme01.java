package constructorsdeneme01;

public class Deneme01 {
	
	int m;

	public Deneme01() {
		
		System.out.println("bos constructor");
		
	}
	Deneme01 (int i){
		
		this.m = i;
		System.out.println("int constructor");

	}

	public static void main(String[] args) {
		
		Deneme01 object = new Deneme01();
		
		Deneme01 obj = new Deneme01(61);
		
		Deneme01 object01 = new Deneme01(61);
		System.out.println("m'nin degeri?" + object01.m);
		
		

	}

}

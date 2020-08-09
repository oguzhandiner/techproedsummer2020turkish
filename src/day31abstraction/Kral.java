package day31abstraction;

public class Kral extends Otel {

	public static void main(String[] args) {

		Kral krl = new Kral();
		krl.tea();
		krl.wifi();
		krl.kahvalti();

	}
	@Override
	public void tea() {
		System.out.println("Kral dairesinde cay verilir");
	}

	@Override
	public void kahvalti() {
		System.out.println("Breakfast time");
	}

}

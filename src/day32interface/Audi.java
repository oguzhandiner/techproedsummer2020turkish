package day32interface;

public class Audi implements Car, Klima {

	public static void main(String[] args) {

	}

	@Override
	public void motor() {

		System.out.println("2.8 Turbo Benzinli");

	}

	@Override
	public void direksiyon() {

		System.out.println("Gercek Deri");

	}

	@Override
	public void teker() {

		System.out.println("Michelin 24 inch celik jant");

	}

	@Override
	public void isitma() {

		System.out.println("var digital");

	}

	@Override
	public void antiBakteri() {

		System.out.println("%99.5 bakteri korumali");

	}

	@Override
	public void fiyatt() {
		// TODO Auto-generated method stub
		
	}

}

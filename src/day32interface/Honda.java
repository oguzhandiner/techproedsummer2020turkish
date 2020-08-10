package day32interface;

public class Honda implements Car, Klima {

	/*
	 * Class'i interface'nin child'i yapmak icin "implements" kullanilir.
	 */

	public static void main(String[] args) {

		Honda honda = new Honda();
		honda.antiBakteri();
		honda.direksiyon();
		honda.isitma();
		honda.motor();
		honda.teker();
		System.out.println(Car.i);
		System.out.println(Klima.i);

	}

	@Override
	public void motor() {

		System.out.println("1.6 VTEC Diesel");

	}

	@Override
	public void direksiyon() {

		System.out.println("Suni Deri");

	}

	@Override
	public void teker() {

		System.out.println("16 inch alasim");

	}

	@Override
	public void isitma() {

		System.out.println("isitma var");

	}

	@Override
	public void antiBakteri() {

		System.out.println("%99 bakteri Koruma");

	}

	@Override
	public void fiyatt() {
		// TODO Auto-generated method stub

	}

}

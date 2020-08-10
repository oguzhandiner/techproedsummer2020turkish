package day32interface;

public class Toyota implements Car, Klima {

	public static void main(String[] args) {

	}

	@Override
	public void motor() {

		System.out.println("1.1 VTEC diesel");

	}

	@Override
	public void direksiyon() {

		System.out.println("plastik");

	}

	@Override
	public void teker() {

		System.out.println("14 inch demir jant");

	}

	@Override
	public void isitma() {

		System.out.println("manuel");
	}

	@Override
	public void antiBakteri() {

		System.out.println("%50 anti bakteri korumali");
	}

	@Override
	public void fiyatt() {
		// TODO Auto-generated method stub
		
	}

}

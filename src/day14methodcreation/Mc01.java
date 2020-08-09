package day14methodcreation;

public class Mc01 {

	public static void main(String[] args) {

		toplama(61, 16);
		cikarma(61, 16);

	}

	public static void toplama(int n1, int n2) {

		System.out.print("Sonuc:" + n1 + " + " + n2 + " = " );
		System.out.println(n1 + n2);

	}
	
	public static void cikarma(int n1, int n2) {
		
		System.out.print("Sonuc:" + n1 + " - " + n2 + " = " );
		System.out.println(n1 - n2);
	}

}

package day08nestedif;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer iki kenar uzunluðu
		 * birbirine eþit ise ekrana “Ikizkenar Ucgen” yazdýrýn. Diðer durumlarda ekrana
		 * “Ikizkenar deðil” yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ucgenin kenar uzunluklarini giriniz? :");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		int kenar3 = scan.nextInt();

		String sonuc = (kenar1 == kenar2 && kenar1 == kenar3 ? "ikizkenar ucgen" : "ikizkenar Degil");
		System.out.println(sonuc);
		scan.close();

	}
}

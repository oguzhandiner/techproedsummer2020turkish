package day08nestedif;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er iki kenar uzunlu�u
		 * birbirine e�it ise ekrana �Ikizkenar Ucgen� yazd�r�n. Di�er durumlarda ekrana
		 * �Ikizkenar de�il� yazd�r�n.
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

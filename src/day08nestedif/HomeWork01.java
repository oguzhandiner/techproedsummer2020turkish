package day08nestedif;

import java.util.Scanner;

public class HomeWork01 {
	
	public static void main(String[] args) {
		
		/*Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		Di�er durumlarda ekrana �Negatif degil� yazd�r�n.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("tam sayi giriniz?");
		int sayi = scan.nextInt();
		
		String sonuc = sayi < 0 ? "negatif" : "negatif degil";
		System.out.println(sonuc);
		scan.close();
	}

}

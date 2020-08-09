package day03veriables;

import java.util.Scanner;

public class Day03HomeWork04 {
	
	public static void main(String[] args) {
		
		/*
		Boyutlarý kullanýcýdan alýnan bir dikdörtgenler prizmasýnýn hacmini hesaplayan bir
		program yazýnýz.
		Not: Dikdörtgenler Prizmasýnýn Hacmi: En x Boy x Yükseklik
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Dikdortgeninizin ''boy'' Uzunlugunu Giriniz:");
		int boy = scan.nextInt();
		
		System.out.println("Lutfen Dikdortgeninizin ''en'' Uzunlugunu Giriniz:");
		int en = scan.nextInt();
		
		System.out.println("Lutfen Dikdortgeninizin ''yukseklik'' Uzunlugunu Giriniz:");
		int yukseklik = scan.nextInt();
		
		int hacim = boy * en * yukseklik;
		System.out.println("Dikdortgenin Hacmi: " + hacim);
		scan.close();
	}

}

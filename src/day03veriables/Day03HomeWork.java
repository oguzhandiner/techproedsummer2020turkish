package day03veriables;

import java.util.Scanner;

public class Day03HomeWork {
	
	public static void main(String[] args) {
		
		/*
	 	Kullanýcýdan karenin kenar uzunluðunu alin ve sonra bu karenin alan ve
		çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		Not: Alan: Boy x En
		Not: Çevre: 2x (Boy + En)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Karenin Kenar Uzunlugunu Giriniz:");
		int kareUzunluk = scan.nextInt();
		
		int alan = kareUzunluk * kareUzunluk;
		
		System.out.println("Karenin Alani:" + alan);
		
		int cevre = 2 * (kareUzunluk + kareUzunluk);
		
		System.out.println("Karenin Cevresi:" + cevre);
		scan.close();
	}

}

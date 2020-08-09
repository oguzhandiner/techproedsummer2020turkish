package day03veriables;

import java.util.Scanner;

public class Day03HomeWork03 {
	
	public static void main(String[] args) {
		
		/*
		Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve
		cevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		Not: Alan: Boy x En
		Not: Çevre: 2x (Boy + En)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Boy Uzunlugunu Giriniz:");
		int boy = scan.nextInt();
		
		System.out.println("Lutfen Dikdortgenin En Uzunlugunu Giriniz:");
		int en = scan.nextInt();
		
		int alan = boy * en;
		System.out.println("Dikdortgeninizin Alani: " + alan);
		
		int cevre = 2 * (boy + en);
		System.out.println("Dikdortgeninizin Cevresi: " + cevre);
		
		scan.close();
		
	}

}

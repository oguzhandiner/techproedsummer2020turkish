package day03veriables;

import java.util.Scanner;

public class Day03HomeWork03 {
	
	public static void main(String[] args) {
		
		/*
		Kullan�c�dan dikd�rtgenin boyutlar�n� alan ve sonra dikt�rtgenin alan ve
		cevresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
		Not: Alan: Boy x En
		Not: �evre: 2x (Boy + En)
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

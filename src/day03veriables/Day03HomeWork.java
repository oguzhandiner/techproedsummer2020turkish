package day03veriables;

import java.util.Scanner;

public class Day03HomeWork {
	
	public static void main(String[] args) {
		
		/*
	 	Kullan�c�dan karenin kenar uzunlu�unu alin ve sonra bu karenin alan ve
		�evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
		Not: Alan: Boy x En
		Not: �evre: 2x (Boy + En)
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

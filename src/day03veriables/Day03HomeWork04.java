package day03veriables;

import java.util.Scanner;

public class Day03HomeWork04 {
	
	public static void main(String[] args) {
		
		/*
		Boyutlar� kullan�c�dan al�nan bir dikd�rtgenler prizmas�n�n hacmini hesaplayan bir
		program yaz�n�z.
		Not: Dikd�rtgenler Prizmas�n�n Hacmi: En x Boy x Y�kseklik
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

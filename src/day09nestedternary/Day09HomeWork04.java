package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork04 {
	
	public static void main(String[] args) {
		
		/*
		Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. En ve boy e�it ise ekrana �Kare�
		farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin En uzunlugunu Giriniz:");
		int en = scan.nextInt();
		
		System.out.println("Dikdortgenin Boy Uzunlugunu Giriniz:");
		int boy = scan.nextInt();
		
		String sonuc = en == boy ? "kare" : "Dikdortgen";
		System.out.println(sonuc);
		
		scan.close();
	}

}

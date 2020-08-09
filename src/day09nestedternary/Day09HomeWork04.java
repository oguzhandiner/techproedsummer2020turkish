package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork04 {
	
	public static void main(String[] args) {
		
		/*
		Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eþit ise ekrana “Kare”
		farklý ise ekrana “Dikdörtgen” yazdýrýn.
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

package day08nestedif;

import java.util.Scanner;

public class HomeWork01 {
	
	public static void main(String[] args) {
		
		/*Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		Diðer durumlarda ekrana “Negatif degil” yazdýrýn.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("tam sayi giriniz?");
		int sayi = scan.nextInt();
		
		String sonuc = sayi < 0 ? "negatif" : "negatif degil";
		System.out.println(sonuc);
		scan.close();
	}

}

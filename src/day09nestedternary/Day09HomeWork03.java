package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork03 {
	
	public static void main(String[] args) {
		
		// Kullanýcýdan bir tamsayý girmesini isteyin, ekrana o tamsayýnýn mutlak degerini yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Tam Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		int sonuc = sayi > 0 ? sayi : (-1) * sayi;
		System.out.println("Mutlak Degeri: " + sonuc);
		scan.close();
	}

}

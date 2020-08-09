package day06ifstatementdt;

import java.util.Scanner;

public class OrLogicalOperators {
	
	public static void main(String[] args) {
		
		/*
		 Kullanicidan sayi alin, bu sayi 0'dan 9'a kadar ise ekrana rakam
		 9'dan buyuk veya 0'dan kucuk ise sayi yazdir.
		 */
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Sayi Giriniz: ");
		
		int sayi = klavye.nextInt();
		
		if (sayi >= 0 && sayi <= 9) {
			
			System.out.println("Rakam");
		}
		
		if (sayi < 0 || sayi > 9) {
			
			System.out.println("Sayi");
		}
		klavye.close();
	}

}

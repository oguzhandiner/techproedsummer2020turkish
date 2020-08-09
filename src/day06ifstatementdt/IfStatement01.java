package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {
	
	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir sayi alin, sayi 3'e bolunuyorsa 3'n kati olarak yazdirin.
		 */
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir TamSayi Giriniz: ");
		
		int sayi = klavye.nextInt();
		
		if(sayi % 3 == 0) {
			
			System.out.println("3'n Kati.");
			
		} 
		
		if (sayi % 3 != 0) {
			
			System.out.println("3'n Kati degildir.");
			
		}
		klavye.close();
	}

}

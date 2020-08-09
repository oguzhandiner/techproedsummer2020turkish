package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork01 {
	
	public static void main(String[] args) {
		
		/*
		 Kullanýcýdan bir tamsayý girmesini isteyin, tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek”
yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Tam Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		if(sayi % 2 == 0) {
			System.out.println("cift Sayi");
		}else {
			System.out.println("tek Sayi");
		}scan.close();
		
		
	}

}

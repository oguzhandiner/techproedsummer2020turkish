package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork02 {
	
	public static void main(String[] args) {
		
		// Kullan�c�dan iki tamsay� girmesini isteyin, ekrana her zaman b�y�k olan�n� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir tam sayi giriniz:");
		int sayi = scan.nextInt();
		
		System.out.println("Lutfen ikinci Tam Sayiyi Giriniz:");
		int sayi02 = scan.nextInt();
		
		if (sayi > sayi02) {
			System.out.println("Buyuk Sayi: " + sayi);
		} else {
			System.out.println("Buyuk Sayi: " + sayi02);
		} scan.close();
		
		
	}

}

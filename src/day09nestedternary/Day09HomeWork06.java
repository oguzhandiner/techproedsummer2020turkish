package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork06 {
	
	public static void main(String[] args) {
		
		/*Kullan�c�dan bir y�l girmesini isteyin, y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil�
yazd�r�n. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Yil Giriniz:");
		int yil = scan.nextInt();
		
		String sonuc = yil % 4 == 0 ? (yil % 100 == 0 && yil % 400 != 0 ? "artik yil degil" : "artik yil" ) : "artik yil degil";
		System.out.println(sonuc);
		scan.close();
	}

}

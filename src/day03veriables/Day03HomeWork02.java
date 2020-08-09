package day03veriables;

import java.util.Scanner;

public class Day03HomeWork02 {
	
	public static void main(String[] args) {
		
		/*
		Kullanýcýdan alýnan bir sayýnýn küpünü hesaplayan bir program yazýnýz.
		Not: a’ nýn küpü: a x a x a
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Sayi Giriniz?");
		int num = scan.nextInt();
		
		int kup = num * num * num;
		System.out.println("Girmis Oldugunuz Sayinin Kupu: " + kup);
		scan.close();
	}

}

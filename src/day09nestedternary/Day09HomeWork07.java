package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork07 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun
		 * miktarý 1000 den fazla ise Kullanýcýya %10 indirim yapýn ve ödemesi gereken
		 * toplam parayý ekrana yazdýrýn. Diðer durumlarda ödemesi gereken toplam parayý
		 * herhangi bir indirim yapmadan ekrana yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("urun miktarini giriniz:");
		int urunMiktar = scan.nextInt();

		System.out.println("birim fiyatini giriniz:");
		int birimFiyat = scan.nextInt();

		double sonuc = urunMiktar > 1000 ? (urunMiktar * birimFiyat * 0.8) : (urunMiktar * birimFiyat); // yuzde 20'lik indirim.
		System.out.println(sonuc);
		scan.close();
	}

}

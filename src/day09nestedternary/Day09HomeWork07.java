package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork07 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun
		 * miktar� 1000 den fazla ise Kullan�c�ya %10 indirim yap�n ve �demesi gereken
		 * toplam paray� ekrana yazd�r�n. Di�er durumlarda �demesi gereken toplam paray�
		 * herhangi bir indirim yapmadan ekrana yazd�r�n.
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

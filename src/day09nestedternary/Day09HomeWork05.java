package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork05 {
	
	public static void main(String[] args) {
		
		/* Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Tam Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		String sonuc = sayi > 99 && sayi < 1000 ? "Uc basamakli sayi" : sayi % 2 == 0 ? "uc basamakli olmayan cift sayi: " : "uc basamakli olmayan tek sayi: ";
		System.out.println(sonuc);
		scan.close();
		
	}

}

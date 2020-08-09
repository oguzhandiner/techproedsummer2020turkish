package day09nestedternary;

import java.util.Scanner;

public class Day09HomeWork05 {
	
	public static void main(String[] args) {
		
		/* Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Tam Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		String sonuc = sayi > 99 && sayi < 1000 ? "Uc basamakli sayi" : sayi % 2 == 0 ? "uc basamakli olmayan cift sayi: " : "uc basamakli olmayan tek sayi: ";
		System.out.println(sonuc);
		scan.close();
		
	}

}

package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {
	
	public static void main(String[] args) {
		
		// Kullanicidan bir sayi alin, negatif ise ekrana negatif, pozitif yazdirin.
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Sayi Giriniz: ");
		
		int sayi = klavye.nextInt();
		
		if (sayi < 0) {
			
			System.out.println("Negatif");
		}
		
		if (sayi > 0) {
			
			System.out.println("Pozitif");
		}
		
		if (sayi == 0) {
			
			System.out.println("Notr");
		}
		klavye.close();
	}

}

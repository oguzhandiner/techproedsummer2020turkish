package day09nestedternary;

import java.util.Scanner;

public class Switch01 {
	
	public static void main(String[] args) {
		
		/*
		 * Kullanicidan bir harf alin
		 * harf 'a' ise ilk har
		 * harf 'b' ise ikinci harf
		 * diger durumlarda tanimlanamadi.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Harf Giriniz:");
		char ch = scan.next().charAt(0);
		
		if(ch == 'a' || ch == 'A') {
			System.out.println("ilk harf");
		}else if(ch == 'b' || ch == 'B') {
			System.out.println("ikinci harf");
		}else if(ch == 'c' || ch == 'C') {
			System.out.println("ucuncu harf");
		}else {
			System.out.println("tanimlanamadi");
		}
		
		// ikinci yol Switch
		
		switch (ch) {
		
		case 'a':
			System.out.println("Switch: ilk harf");
			break;
			
		case 'A':
			System.out.println("Switch: ilk harf");
			break;
			
		case 'b':
			System.out.println("Switch: ikinci harf");
			break;
			
		case 'B':
			System.out.println("Switch: ikinci harf");
			break;
			
			default:
				System.out.println("Switch: tanimlanamadi");
		
		}
		scan.close();
		
	}

}

package day09nestedternary;

import java.util.Scanner;

public class HomeWorkSwitch02 {
	
	public static void main(String[] args) {
		
		/*Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
Bu harflerin d���nda bir character i�in �Ge�ersiz character� yazd�r�n.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Karakter Giriniz?");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		case 'a':
			
		case 'e':
			
		case 'i':
			
		case 'o':
			
		case 'u':
			System.out.println("sesli harf");
			break;
		case 'b':
			
		case 'c':
			
		case 'd':
			
		case 'f':
			System.out.println("sessiz harf");
			break;
			
			default:
				System.out.println("Gecersiz bir karakter girisi !");
		}scan.close();
		
	}
	

}

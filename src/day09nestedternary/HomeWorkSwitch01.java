package day09nestedternary;

import java.util.Scanner;

public class HomeWorkSwitch01 {
	
	public static void main(String[] args) {
		
		/*Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n.
�Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n. �Pazar� ise ekrana
�H�ristiyanlar i�in kutsal g�n� yazd�r�n. Diler g�nler icin �Kutsal g�n de�il� yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Gun Giriniz: ");
		String gun = scan.next();
		
		switch (gun) {
		
		case "Cuma":
			System.out.println("Muslumanlar icin Kutsal Gun");
			break;
		case "Cumartesi":
			System.out.println("Yahudiler Icin Kutsal Gun");
			break;
		case "Pazar":
			System.out.println("Hristiyanlar Icin Kutsal Gun");
			break;
			
			default:
				System.out.println("Kutsal Gun Degil");
			/*
		case "Pazartesi":
			System.out.println("Kutsal Gun Degil");
			break;
		case "Sali":
			System.out.println("Kutsal Gun Degil");
			break;
		case "Carsamba":
			System.out.println("Kutsal Gun Degil");
			break;
		case "Persembe":
			System.out.println("Kutsal Gun Degil");
			break;
			*/
		scan.close();
		}
		
	}

}

package day09nestedternary;

import java.util.Scanner;

public class HomeWorkSwitch01 {
	
	public static void main(String[] args) {
		
		/*Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. “Pazar” ise ekrana
“Hýristiyanlar için kutsal gün” yazdýrýn. Diler günler icin “Kutsal gün deðil” yazdýrýn.
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

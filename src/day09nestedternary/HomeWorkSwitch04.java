package day09nestedternary;

import java.util.Scanner;

public class HomeWorkSwitch04 {
	
	public static void main(String[] args) {
		
		/*Kullan�c�dan ay ismi al�n e�er ay ismi 31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n.
E�er ay ismi 30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n.
E�er ay ismi 28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n.
Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir ay ismi giriniz?");
		String ay = scan.next();
		
		switch (ay) {
		case "Ocak":
		case "Mart":
		case "Mayis":
		case "Temmuz":
		case "Agustos":
		case "Ekim":
		case "Aralik":
			System.out.println("31 ceken aylardan.");
			break;

		case "Nisan":
		case "Haziran":
		case "Eylul":
		case "Kasim":
			System.out.println("30 ceken aylardan.");
			break;
			
		case "Subat":
				System.out.println("28 ya da 29 ceken ay Subat ayidir.");
				break;
				
				default:
					System.out.println("gecerli ay ismi giriniz!");
		scan.close();
		
		
		
		}
		
		
		
	}

}

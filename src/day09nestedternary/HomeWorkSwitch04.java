package day09nestedternary;

import java.util.Scanner;

public class HomeWorkSwitch04 {
	
	public static void main(String[] args) {
		
		/*Kullanýcýdan ay ismi alýn eðer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn.
Eðer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn.
Eðer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn.
Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.*/
		
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

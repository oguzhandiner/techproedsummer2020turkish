package day09nestedternary;

import java.util.Scanner;

public class HomeWorkSwitch03 {
	
	public static void main(String[] args) {
		
		/*Kullanýcýdan bir tamsayý alýn eðer tamsayý 9 ise ekrana “Bir basamaklý en büyük sayý” yazdýrýn.
99 ise ekrana “Ýki basamaklý en büyük sayý” yazdýrýn.
999 ise ekrana “Üç basamaklý en büyük sayý” yazdýrýn.
Bu sayýlarýn dýþýndaki sayýlar için “Yorum yok” yazdýrýn.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam sayi giriniz:");
		int sayi = scan.nextInt();
		
		switch(sayi) {
		case 9:
			System.out.println("Bir Basamakli En buyuk Sayi");
			break;
		case 99:
			System.out.println("iki basamakli en buyuk sayi");
			break;
		case 999:
			System.out.println("uc basamakli en buyuk sayi");
			break;
			
			default:
				System.out.println("yorum yok");
				scan.close();
		
		
		}
		
		
	}

}

package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Cinsiyetinizi Giriniz: ");
		String cinsyt = scan.next();
		
		System.out.println("Lutfen Yasinizi Giriniz: ");
		byte age = scan.nextByte();
		
		if (cinsyt.equals("Erkek")) {
			if(age < 18) {
				System.out.println("Erkek Cocuk");
			}else {
				System.out.println("Tanimlanamadi");
			}
		}
		
		if(cinsyt.equals("Kadin")) {
			if(age < 18) {
				System.out.println("Kadin Cocuk");
			}else {
				System.out.println("Tanimsiz");
			}
		}
		scan.close();
	} 
	
}

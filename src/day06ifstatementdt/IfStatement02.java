package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Gun Giriniz: ");
		
		String gun = klavye.nextLine();
		
		if (gun.equals("Cuma")) {
			
			System.out.println("Muslumanlar icin Mubarek Gundur.");
		}
		
		if (gun.equals("Cumartesi")) {
			
			System.out.println("Yahudiler icin Mubarek Gundur.");
		}
		
		if (gun.equals("Pazar")) {
			
			System.out.println("Hristiyanlar icin Mubarek Gundur.");
		}
		klavye.close();
	}

}

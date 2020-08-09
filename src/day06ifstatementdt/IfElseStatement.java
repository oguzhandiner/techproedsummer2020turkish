package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Sayi Giriniz: ");
		
		int sayi = klavye.nextInt();
		
		if(sayi >= 10 && sayi < 100) {
			
			System.out.println("Iki Basamakli Sayi");
		} else {
			
			System.out.println("iki basamakli degil");
		}
		klavye.close();
		
	}

}

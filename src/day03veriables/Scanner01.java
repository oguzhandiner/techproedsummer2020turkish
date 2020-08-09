package day03veriables;

import java.util.Scanner;

public class Scanner01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Adinizi giriniz: ");
		
		String isim = scan.nextLine();
		
		System.out.println(isim);
		scan.close();
		
	}

}

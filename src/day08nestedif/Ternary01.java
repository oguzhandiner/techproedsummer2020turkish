package day08nestedif;

import java.util.Scanner;

public class Ternary01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Sayi Giriniz:");
		int num = scan.nextInt();
		
		System.out.println(num >= 0 && num <= 9 ? "Rakam" : "Sayi");
		scan.close();
		
	}
	
}

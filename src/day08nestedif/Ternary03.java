package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Islem Giriniz: ");
		char ch = scan.next().charAt(0);
		
		System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? "Harf" : "Harf Degil");
		scan.close();
	}

}

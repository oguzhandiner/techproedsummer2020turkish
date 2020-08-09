package day09nestedternary;

import java.util.Scanner;

public class NestedTernary01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Sayi Giriniz:");
		int num = scan.nextInt();
		
		String result = num > 0 ? num > 9 ? "Sayi" : "Rakam" : num == 0 ? "Rakam" : "Negatif sayi";
		System.out.println(result);
		scan.close();
		
	}

}

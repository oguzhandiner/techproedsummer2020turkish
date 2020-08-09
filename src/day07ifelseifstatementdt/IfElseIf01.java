package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir sayi Giriniz:");
		
		double num = scan.nextDouble();
		
		if (num > 0) {
			System.out.println("pozitif");
		} else if(num == 0) {
			System.out.println("notr");
		} else {
			System.out.println("negatif");
		} 
		scan.close();
	}

}

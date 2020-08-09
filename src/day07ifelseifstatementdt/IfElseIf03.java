package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Yasinizi Giriniz:");
		
		int age = scan.nextInt();
		
		if(age < 0) {
			System.out.println("yas negatif olamaz");
		} else if(age < 13) {
			System.out.println("calisamaz");
		} else if (age < 65) {
			System.out.println("calisabilir");
		} else {
			System.out.println("emekli");
		}
		scan.close();
	}

}

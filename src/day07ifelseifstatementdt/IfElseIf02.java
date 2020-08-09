package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Haraf Giriniz:");
		
		char harf = scan.next().charAt(0);
		
		if (harf == 'a' || harf == 'A') {
			System.out.println("Alfabenin ilk harfi");
		} else if(harf == 'b' || harf == 'B') {
			System.out.println("Alfabenin ikinci harfi");
		} else if(harf == 'c' || harf == 'C') {
			System.out.println("Alfabenin ucuncu harfi");
		} else {
			System.out.println("sirasini bilmiyorum");
		}
		scan.close();
	}

}

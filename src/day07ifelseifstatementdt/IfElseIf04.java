package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Birinci notu Giriniz:");
		byte note = scan.nextByte();
		
		System.out.println("Lutfen ikinci notu Giriniz:");
		byte note1 = scan.nextByte();
		
		int ort = (note + note1) / 2; 
		System.out.println("Notunuz: " + ort);
		
		if(note < 0 || note1 < 0) {
			System.out.println("Lutfen gecerli bir not giriniz!");
		}else if(ort < 50) {
			System.out.println("kaldiniz :(");
		}else if(ort < 70) {
			System.out.println("Notunuz C");
		}else if(ort < 85) {
			System.out.println("Notunuz B");
		}else if(ort <= 100) {
			System.out.println("Notunuz A");
		}else {
			System.out.println("Gecerli not Giriniz!");
		}
		scan.close();
	}

}

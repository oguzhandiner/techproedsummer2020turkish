package day03veriables;

import java.util.Scanner;

public class Day03HomeWork05 {
	
	public static void main(String[] args) {
		
		/*
		Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan
		bir program yaz�n�z. (float kullan�n�z)
		Not 1: pi say�s�: 3.14159
		Not 2: Alan: 3.14159 x radius x radius
		Not 3: Cevre: 2 x 3.14159 x radius
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Dairenin Yari Capini Giriniz:");
		float yaricap = scan.nextFloat();
		
		float pi = 3.14159f;
		
		float alan = pi * yaricap * yaricap;
		System.out.println("Dairenin alani: " + alan);
		
		float cevre = 2 * pi * yaricap;
		System.out.println("Dairenin Cevresi: " + cevre);
		scan.close();
		
	}

}

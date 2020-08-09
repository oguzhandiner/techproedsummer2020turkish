package day08nestedif;

import java.util.Scanner;

public class Ternary02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Ucgenin 1. Kenar Uzunluklarini Giriniz:");
		int ucgen = scan.nextInt();
		
		System.out.println("Lutfen Ucgenin 2. Kenar Uzunluklarini Giriniz:");
		int ucgen2 = scan.nextInt();
		
		System.out.println("Lutfen Ucgenin 3. Kenar Uzunluklarini Giriniz:");
		int ucgen3 = scan.nextInt();
		
		System.out.println(ucgen == ucgen2 && ucgen2 == ucgen3 ? "Es Kenar Ucgen": "Eskenar Degil");
		scan.close();
	}

}

package day09nestedternary;

import java.util.Scanner;

public class Switch04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Ay Ismini Giriniz:");
		String mounts = scan.next();
		
		switch(mounts) {
		
		case ("January"):
		case ("December"):
		case ("February"):
			System.out.println("Winter");
		break;
		
		case ("March"):
		case ("April"):
		case ("May"):
			System.out.println("ilkbahar");
		break;

		case ("June"):
		case ("July"):
		case ("August"):
			System.out.println("Summer");
		break;
		
		case ("September"):
		case ("October"):
		case ("November"):
			System.out.println("Sonbahar");
		break;
		
		default:
			System.out.println("gecerli ay ismi giriniz!");
		
		}scan.close();
		
	}

}

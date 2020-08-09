package day03veriables;

import java.util.Scanner;

public class Scanner02 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen Isminizi Giriniz: ");
		
		String tamIsim = klavye.nextLine();
		
		System.out.println(tamIsim);
		
		System.out.println("Lutfen Yasinizi Giriniz: ");
		
		byte yas = klavye.nextByte();
		
		System.out.println(yas);
		
		System.out.println("Lutfen Isminizin Ilk harfiniz Giriniz: ");
		
		char ilkHarf = klavye.next().charAt(0);
		
		System.out.println(ilkHarf);
		
		klavye.close();
		
	}

}

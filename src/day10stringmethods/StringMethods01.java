package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {

		String deneme = "Hayat ah Hayat";

		System.out.println(deneme.contains("H"));
		System.out.println(deneme.contains("t,t"));
		
		// contains methodu bir String'de herhangi bir charecter veya charakterlerin
		// olup olmadigini kontrol eder.
		// varsa true yoksa false verir.
		
		String u = "Guzel Gunler!";
		System.out.println("endWith: " + u.endsWith("!"));
		

	}

}

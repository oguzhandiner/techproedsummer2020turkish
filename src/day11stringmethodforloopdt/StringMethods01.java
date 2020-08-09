package day11stringmethodforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {

		String o = "hadi gidelim bu diyarlardan";

		System.out.println(o.startsWith("H"));
		System.out.println(o.startsWith("h"));
		System.out.println(o.startsWith(""));
		System.out.println(o.startsWith("hadi"));
		System.out.println(o.startsWith("b", 13)); // ikinci siradaki.
		System.out.println(o.indexOf("i"));
		System.out.println(o.indexOf('e')); // indexof'da hem String hem de char kullanabiliriz.
		System.out.println(o.indexOf("deli")); // birden fazla karakter kullanirsak java ilk harfin index'ini verir.
		System.out.println(o.indexOf("o"));
		System.out.println(o.indexOf("a", 9));
		System.out.println(o.indexOf("e", 8));
		
		// 13. Method (lastIndexOf()).
		
		String e = "Java ah Java";
		System.out.println("v lastIndexOf: " + e.lastIndexOf("v"));
		System.out.println("v lastIndexOf: " + e.lastIndexOf("av"));
		
		// 14. Method ( substring() ) bir String'n belli bir bolumunu kesip almaya yarar.
		
		String z = "BordoMavi";
		System.out.println("BordoMavi substring: " + z.substring(5));
		System.out.println("BordoMavi substring: " + z.substring(3));
		System.out.println("BordoMavi substring: " + z.substring(3, 6));
		// substring methodunda baslangic index'i bitis index'nden buyuk olamaz.
		
		// 15. Method ( trim() ) bir String'n bas ve son taraflarinda ki (space'leri) siler.
		
		String m = "  Java   ";
		System.out.println ("m length: " + m.length());
		System.out.println("m trim: " + m.trim().length());
		
	}

}

package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {

		// bir elemani degistirme

		List<String> sl = new ArrayList<>();

		sl.add("Efile");
		sl.add("Cagri");
		sl.add("Haluk");

		sl.set(2, "Yusuf");
		System.out.println(sl);
		// set methodu bir elemani degistirmeye yarar.

		System.out.println(sl.contains("Hakki"));
		// contains methodu bir elemanin var olup olmadigini kontrol eder.

		Collections.sort(sl);
		System.out.println(sl);
		// Collections.sort methodu degerleri kucukten buyuge dogru alfabetik siraya
		// gore siralar.

		Collections.reverse(sl);
		System.out.println(sl);
		// Collections.reverse methodu degerleri alfabetik siraya gore tersten siralar.
		
		sl.clear();
		System.out.println(sl);
		// clear methodu List'de ki degerlerin hepsini siler.
		
		// List<int> il1 = new ArrayList<>();
		// Note: List'ler asla primitive ile calismazlar!
		
	}

}

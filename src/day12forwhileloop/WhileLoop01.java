package day12forwhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {

		// ilk 10 sayma sayisini ekrana yazdirin.

		int i = 1;

		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();

		int w = 10;

		while (w >= 1) {

			System.out.print(w + " ");
			w--;
		}

		System.out.println();

		// ilk 100 cift sayma sayisini ekrana yazdiran bir program.
		int o = 1;

		while (o <= 200) {
			if (o % 2 == 0) {
				System.out.print(o + " ");
			}
			o++;
		}
		
		System.out.println();
		
		// j'den onceki harfleri yazdirin.
		
		char h = 'a';
		
		while (h < 'j') {
			System.out.print(h + " ");
			h++;
		}
		
		System.out.println();
		
		// ASCII tabloda ilk buyuk 5 harfin degerini yaziniz.
		
		int toplam = 0;
		char ogi = 'A';
		
		while(ogi <= 'E') {
			toplam = toplam + ogi;
			ogi++;
		}
		System.out.println(toplam);
		

	}

}

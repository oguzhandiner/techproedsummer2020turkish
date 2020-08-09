package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {

		// multi dimensional olusumu
		int mda[][] = new int[3][2];

		// array'de deger atamasi
		mda[0][1] = 23;
		mda[0][0] = 10;
		mda[1][0] = 7;
		mda[1][1] = 12;
		mda[2][0] = 11;
		mda[2][1] = 55;

		System.out.println(Arrays.deepToString(mda));

		// multi dimensional istedigimiz degeri gormek

		System.out.println(Arrays.toString(mda[0]));

		System.out.println(mda[2][0]);

		// multi dimensional olusturmanin kisa yolu

		char mdac[][] = { { 'a', 'b', 'e', 'o' }, { 'd' }, { 'e', 'f' }, { 'g', 'h', 'i' } };
		System.out.println(Arrays.deepToString(mdac));

		// Soru: yukarida ki multidimensional array'da ki ilk array'lerin ascii
		// degerlerinin toplami?

		// 1. Yol
		System.out.println(mdac[0][0] + mdac[0][1] + mdac[0][2]);

		// 2/Yol
		int sum = 0;
		for (int i = 0; i < mdac.length; i++) {

			sum = sum + mdac[0][i];
		}
		System.out.println("ikinci yol: " + sum);

	}

}

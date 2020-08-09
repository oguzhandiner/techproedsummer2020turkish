package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {

		// Array elemanlarini kucukten buyuge dogru sirala.
		int arr[] = { 3, 7, 1, 18 };
		Arrays.parallelSort(arr); // sort methodu her zaman kucukten buyuge dogru dizer.

		System.out.println(Arrays.toString(arr));

		char array[] = { 'A', 'E', 'Z', 'O' };
		Arrays.parallelSort(array);

		System.out.println(Arrays.toString(array));

		// Bir integer array'da ki en buyuk ve en kucuk sayiyi ekrana yazdir.

		int arrays[] = { 13, 61, 16, 55, 6, 34 };
		Arrays.parallelSort(arrays);
		System.out.println(Arrays.toString(arrays));
		System.out.println("en Kucuk: " + arrays[0]);
		System.out.println("en Buyuk: " + arrays[arrays.length - 1]);

		char crr[] = { 'E', 'O', 'Z', 'M', 'G', 'F' };
		Arrays.parallelSort(crr);
		System.out.println(Arrays.toString(crr));
		System.out.println("Bastan Ikinci: " + crr[1]);
		System.out.println("Sondan ikinci: " + crr[crr.length - 2]);

		// bi degerin array'de olup olmadigini kontrol etmek

		int nrr[] = { 2, 1, 7, 3, 5 };

		// nrr array'de 7 var mi yok mu?

		// 1.Yol: loop ile

		int count = 0;

		for (int i = 0; i < nrr.length; i++) {
			if (nrr[i] == 7) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("7 var");

		} else {
			System.out.println("7 yok");
		}

		// 2. yol: binarySearch() kullanarak
		// once sort() methodunu kullanmalisiniz.
		Arrays.parallelSort(nrr);
		System.out.println(Arrays.binarySearch(nrr, 7));

		// binarySearch() methodu array'de asla negatif output vermez.

		// Note: bir array'de tekrarli degerler varsa binarySearch() methodu elemanin
		// var olup olmadigi hakkinda dogru karar verebilir
		// ama o elemanin sirasi hakkinda bazen yanilabilir.

	}

}

package day20multidimensionalarrays;

public class Mda02 {

	public static void main(String[] args) {

		// Soru: int multidimensional array olusturun, tum elemanlarin toplami yazdir.

		int mdai[][] = { { 1, 2, }, { 3 }, { 4, 5, 6 } };

		// 1. yol
		System.out.println("1, yol: " + mdai[0][0] + mdai[0][1] + mdai[1][0] + mdai[2][0] + mdai[2][1] + mdai[2][2]);

		// 2. yol
		int sum = 0;
		for (int i = 0; i < mdai.length; i++) {

			for (int j = 0; j < mdai[i].length; j++) {
				sum = sum + mdai[i][j];
			}
		}
		System.out.println("ikinci yol: " + sum);

	}

}

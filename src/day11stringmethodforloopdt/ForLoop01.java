package day11stringmethodforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Java");
		}

		for (int i = 1; i <= 7; i++) {
			System.out.println(i);
		}

		for (int i = 4; i >= 1; i--) {
			System.out.println(i);

		}

		for (int i = 2; i <= 6; i = i + 2) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 6; i++) {
			if (i %2 == 0) {
				System.out.println("ikinci yol: " + i);
			}
		}

	}

}

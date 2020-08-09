package day19arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {

		String str = "Ali topu at, topu at Ali";

		String strArray[] = str.split(",");
		System.out.println(Arrays.toString(strArray));

		// str String'nde kac kelime var?

		String sArray[] = str.split(" ");
		System.out.println(Arrays.toString(sArray));
		System.out.println(sArray.length);

		String tArray[] = str.split("");
		System.out.println(Arrays.deepToString(tArray));
		System.out.println(tArray.length);
		
		int arr1 [] = {1, 2, 3};
		int arr2 [] = {1, 2, 3};
		
		if(arr1 == arr2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		int arr3 [] = {1, 2, 3};
		int arr4 [] = {1, 2, 3};
		
		if(Arrays.equals(arr3, arr4)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}


	}

}

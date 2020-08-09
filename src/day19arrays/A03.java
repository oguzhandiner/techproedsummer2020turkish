package day19arrays;

import java.util.Arrays;

public class A03 {
	public static void main(String[] args) {
		
		int[] x = {2, 1, 4, 5, 7};
		int limit = 3;
		int i = 0;
		int sum = 0;
		
		while ((sum < limit) && (i < x.length)) {
			
			i++;
			sum = sum + x[i];
		}
		System.out.println(i);
		
		int [ ] y = {0, 1, 2, 3};
		int temp;
		int j = 0;
		int k = y.length - 1;
		
		while (j < k) {
			temp = y[j];
			y[j] = y[k];
			y[k] = 2 * temp;
			
			j++;
			k--;
		}
		System.out.println(Arrays.toString(y));
				
		
	}

}

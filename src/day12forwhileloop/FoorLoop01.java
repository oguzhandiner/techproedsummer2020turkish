package day12forwhileloop;

public class FoorLoop01 {
	
	public static void main(String[] args) {
		
		int toplam = 0;
		
		for(int i = 1; i <= 30; i++) {
			
			System.out.print(i + " ");
			
			toplam = toplam + i;
		}
		System.out.println(toplam);
		
		double sum = 1;
		
		for(double i = 1; i <= 10; i++) {
			sum = sum * i;
			System.out.println(sum);
		}
		
		int genel = 0;
		for(int i = 100; i < 109; i++) {
			if(i %3 == 0) {
				
				genel = genel + i;
			}
		}
		System.out.println("uce Bolunen sayilarin toplami: " + genel);
		
	}

}

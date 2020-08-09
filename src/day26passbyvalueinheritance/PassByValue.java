package day26passbyvalueinheritance;

public class PassByValue {

	/*
	 * Java bir Method'a bir Veriable(degisken)'e ait degeri yollarken o degerin
	 * kopyasini olusturur ve kopyayi methoda yollar.
	 * 
	 */

	public static void main(String[] args) {

		int gomlek = 100;

		System.out.println("Gomlek Etiket Fiyati: " + gomlek + " TL");
		System.out.println();

		System.out.println("Ogretmen Indirimi: " + indOgretmen(gomlek) + " TL");
		System.out.println("Asker Indirimi: " + indAsker(gomlek) + " TL");
		System.out.println("Ogrenci Indirimi: " + indOgrenci(gomlek) + " TL");

	}

	public static int indOgretmen(int gomlek) {

		return gomlek - 20;

	}

	public static int indAsker(int gomlek) {
		return gomlek - 5;

	}

	public static int indOgrenci(int gomlek) {
		return gomlek - 30;

	}

}

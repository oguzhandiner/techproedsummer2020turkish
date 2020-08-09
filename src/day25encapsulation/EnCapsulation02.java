package day25encapsulation;

public class EnCapsulation02 {

	public static void main(String[] args) {

		EnCapsulation01 obj = new EnCapsulation01();
		System.out.println("Sifre: " + obj.getSifre());

		System.out.println("isim: " + obj.getIsim());

		GetterSetterMethodlari obj1 = new GetterSetterMethodlari();

		System.out.println("isim: " + obj1.getIsim());
		System.out.println("parola: " + obj1.getParola());
		
		
		obj.setSifre(6161);
		System.out.println("Yeni sifre: " + obj.getSifre());
		
		obj.setIsim("Oguzhan <3 Ebru");
		System.out.println("Yeni Isim: " + obj.getIsim());
		
		obj1.setParola(5561);
		System.out.println("yeni Parola: " + obj1.getParola());
	}

}

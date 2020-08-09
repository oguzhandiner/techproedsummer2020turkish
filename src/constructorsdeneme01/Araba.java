package constructorsdeneme01;

public class Araba {

	String marka = "ford";
	String model = "focus";
	int yil = 2018;
	int fiyat = 20000;

	private Araba(int yil, int fiyat) {
		this.yil = yil;
		this.fiyat = fiyat;

	}
	
	Araba(String marka, String model, int yil, int fiyat){
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.fiyat = fiyat;
		
	}

	public static void main(String[] args) {

		Araba fordfocus = new Araba(2020, 16000);
		System.out.println("marka: " + fordfocus.marka);
		System.out.println("model: " + fordfocus.model);
		System.out.println("yil: " + fordfocus.yil);
		System.out.println("Fiyat: " + fordfocus.fiyat);
		
		Araba obj = new Araba("Volvo", "S60" , 2020, 61000);
		System.out.println("marka: " + obj.marka);
		System.out.println("model: " + obj.model);
		System.out.println("yil: " + obj.yil);
		System.out.println("Fiyat: " + obj.fiyat);

	}

}

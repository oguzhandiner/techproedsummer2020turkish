package day25encapsulation;

public class EnCapsulation01 {

	/*
	 * 1) Encapsulation "Data saklamak(hiding)" demektir. 2) Encapsulation yapmak
	 * icin veriable(degisken) "private" yapariz.
	 */

	private int sifre = 6116; // encapsulation...
	private String isim = "Oguzhan";

	public static void main(String[] args) {

	}

	/*
	 * Encapsulation yaptiginiz Variable(Degisken)'n baska claslardan okunabilmesi
	 * icin getter method olusturmaniz gerekir.
	 * 
	 * Getter Method olusturmak icin; 1) public ile baslanmalidir. 2) return type
	 * ayni olmalidir. 3) getter Methodu yazarak variable(degisken) ismini
	 * yazmaliyiz. 4) camelCase olarak yazilmalidir.
	 */
	public int getSifre() {
		return sifre;

	}

	public String getIsim() {
		return isim;
	}

	/*
	 * Setter Method olusturmak icin; 1) public ile baslanmalidir, return type
	 * "void" olmalidir. 2) Method parantezi icine degistirmek istedigimiz
	 * veriable(Degisken) ismi yazilmalirdi. 3) Setter methodu update(guncelleme,
	 * degistirme) yapmamizi saglar.
	 */
	public void setSifre(int sifre) {
		this.sifre = sifre;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

}

package day32interface;

public interface Car {
	
	/*
	 * interface'ler iclerinde ki method'lari default olarak "abstract" olarak kabul eder.
	 * abstract berlirtmek istege baglidir.
	 * 
	 * interfade'de ki methodlar default olarak public'tir.
	 * 
	 * interface'lerde veriable(degerler) final olurlar.
	 * 
	 * interface'lerde veriable acces modifier'lari default olarak public olur.
	 * 
	 */
	
	int i = 61;
	
	public void motor();
	
	public abstract void direksiyon(); 
	
	// interfade'de ki methodlar default olarak public'tir.
	void teker();
	
	void fiyatt();

}

package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {

	public static void main(String[] args) {

		// list olusturma nasil yapili?
		// 1.Yol

		ArrayList<String> sl = new ArrayList<String>();

		// 2.yol
		ArrayList<String> sl2 = new ArrayList<>();

		// 3.yol
		List<String> sl3 = new ArrayList<>();
		System.out.println(sl3);

		// add methodu her zaman elemani en sag tarafa ekler
		sl3.add("A");
		System.out.println(sl3);

		sl3.add("B");
		System.out.println(sl3);

		// herhangi bir index'e eleman ekleme

		sl3.add(0, "O");
		System.out.println(sl3);

		// Listlerde eleman sayisi bulma

		System.out.println("Eleman sayisi: " + sl3.size());

		// bir List'n bos mu dolu mu oldugunu bulma
		System.out.println(sl3.isEmpty());

		// List'de index'den silme
		sl3.remove(1);
		System.out.println(sl3);

	}

}

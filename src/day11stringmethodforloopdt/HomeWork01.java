package day11stringmethodforloopdt;

public class HomeWork01 {

	public static void main(String[] args) {

		String str = "Cat, caterpillar";
		
		
		  System.out.println(str.indexOf("c")); // 5
		  System.out.println(str.indexOf("cat")); // 5
		  System.out.println(str.indexOf("s")); // -1
		  System.out.println(str.indexOf("CAT")); // -1
		  System.out.println(str.indexOf("ter")); // 7
		  System.out.println(str.indexOf("pars")); // -1
		  System.out.println(str.indexOf("a" ,3 )); // 6
		  System.out.println(str.indexOf("at", 2)); // 6
		  System.out.println(str.indexOf("at", 8)); // -1
		  
		  String str2 = "Cat, caterpillar";
				  System.out.println(str2.lastIndexOf("a")); // false, -1
				  System.out.println(str2.lastIndexOf("at")); // 
				  System.out.println(str2.lastIndexOf("s"));
				  System.out.println(str2.lastIndexOf("CAT"));
				  System.out.println(str2.lastIndexOf("pars"));
				  System.out.println(str2.lastIndexOf("a" , 3 ));
				  System.out.println(str2.lastIndexOf("a" , 5 ));
				  System.out.println(str2.lastIndexOf("at", 2));
				  System.out.println(str2.lastIndexOf("at", 7));
		 
		
		

	}

}

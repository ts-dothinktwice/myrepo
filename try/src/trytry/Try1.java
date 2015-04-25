package trytry;

public class Try1 {

	public static void main(String[] args) {
		System.out.println("main");
		String renketsu = renketsu("AAA","BBB");
		System.out.println(renketsu);
	}

	public static String renketsu(String first, String second){
		String renketsu = first + second;
		return renketsu;
	}
}

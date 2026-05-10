package javex;

public class heroku {

	public static void main(String[] args) {

		String str1 = "concat";
		String str3 = "concat";

		System.out.println(str1);

		String str2 = new String();
		str2 = "concatination";
		System.out.println(str2);
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
	
		System.out.println(str2.hashCode());
		System.out.println(str1==str2);
	}

}

package javex;

public class ho {

	public static void main(String[] args) {

		String s1 = "nigga";
		String s2 = "NIGGa";
		System.out.println(s1.startsWith("ni"));
		System.out.println(s1.startsWith("ga"));
		System.out.println(s1.replaceAll("g","3"));
		System.out.println(s1.concat("nigga1"));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.subSequence(0, 4));
		System.out.println(s1.equalsIgnoreCase(s2));




		
	}

}

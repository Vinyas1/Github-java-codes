package javex;
import java.util.*;
	public class stringrev {
		public static void main(String[] args) {
			String str1 = "concat";
			String str2 = "concatination";
String str3 = "   Kodnest pvt lmted banglore    ";
System.out.println(str1.compareTo(str2));
	 
	System.out.println(str2.compareTo("banana"));
	System.out.println("donkey".compareTo("banana"));
	System.out.println("Zebra".compareTo("Apple"));
	System.out.println("Apple".compareTo("Zebra"));
	
	System.out.println(str1.concat(str2));
	System.out.println(str1.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.charAt(5));
	System.out.println(str1.indexOf("c"));
	System.out.println(str1.lastIndexOf("c"));
	System.out.println(str2.endsWith("nation"));
	System.out.println(str2.startsWith("con"));
	String n = str2.substring(0,6);
	System.out.println(n);
	System.out.println(n.equals(str1));
	System.out.println(str2.replace("a", " "));
	
	char [] c  =str2.toCharArray();
	for(int i=0;i<c.length;i++) {
	System.out.print(c[i] +" ");
	}
	System.out.println();
String [] split = str2.split("a");
for(int i=0;i<split.length;i++) {
	System.out.print(split[i] + " ");
}
System.out.println();
System.out.println(str3.trim());
System.out.println(str3.replaceAll(" ", ""));

StringBuffer sb = new StringBuffer("nigga get ya ass back hojem");
 System.out.println(sb);
 
 StringBuffer sb0 = new StringBuffer();
 sb0.append(str1);
 sb0.append(str2);
 System.out.println(sb0);
 
 StringBuffer sb1 = new StringBuffer();
 sb1.append("high cahinsmokerrs");
 sb1.append("onerepublic");
 sb1.insert(sb1.length(), "malone");
 
 
 System.out.println(sb1.delete(4, 5));
 sb1.setCharAt(0,'N');
 sb1.setCharAt(sb1.length()-1, 'N');
 System.out.println(sb1);
 
 String fah =sb1.toString();
 
		}

}

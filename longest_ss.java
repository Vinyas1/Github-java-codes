package javex;
import java.util.*;
public class longest_ss {

	static boolean palindrome(String ss) {
	int i=0;
	int j = ss.length()-1;
	boolean ispalindrome = true;
	while(i<=j) {
		if(ss.charAt(i)!= ss.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	}
	public static void main(String[] args) {
Scanner  sc = new Scanner(System.in);

String s = sc.next();
String LSS = " ";
for(int i=0;i<s.length();i++) {
	for(int j=i+1;j<s.length();j++) {
		String ss = s.substring(i,j);
		 
		if(palindrome(ss) ==true && ss.length()>LSS.length()) {
			LSS = ss;
		}
	}
	
}
System.out.println(LSS);

	}

}

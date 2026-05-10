package javex;
import java.util.*;
public class palind {

	public static void main(String[] args) {

String s = "malayalam";
int i=0;
int j = s.length()-1;
boolean ispalindrome = true;
while(i<j) {
	if(s.charAt(i) !=s.charAt(j)) {
		ispalindrome = false;
		break;
		
	}
	i++;
	j--;
}
	if(ispalindrome == false) {
		System.out.println("not a palindrome");
	}
	else {
		System.out.println("palindorme");
	
}
	}

}

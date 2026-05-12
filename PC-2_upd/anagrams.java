package javex;
import java.util.*;
public class anagrams {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String m = sc.next().toLowerCase();
String ss = sc.next().toLowerCase();
int a = m.length();
int b = ss.length();
if(b>a) {
	System.out.println(0);
	return;
}
char [] c = ss.toCharArray();
Arrays.sort(c);
String sorted_ss = new String(c);

int count =0;

for(int i=0;i<=a-b;i++) {
	String sub = m.substring(i,i+b);
	char [] cc = sub.toCharArray();
	Arrays.sort(cc);
	String subsortstring = new String(cc);
	//sorting
	//.equalsigorecase optional
	if(sorted_ss.equalsIgnoreCase(subsortstring)){
		count++;
	}
	
	
}
System.out.println(count);

	}

}

package javex;
import java.util.*;


public class yugy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

String s = sc.nextLine();
s = s.substring(1,s.length()-1);
String [] x = s.split(",");


int[] a = new int[x.length];
for(int i=0;i<x.length;i++) {
	a[i] = Integer.parseInt(x[i].trim()); 
}



for(int i=0;i<a.length;i++) {
	System.out.print(a[i] +" ");
}
	}

}

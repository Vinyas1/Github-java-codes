package javex;
import java.util.*;


public class slidingwind {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int windsum = 0;
System.out.println("enter the  size");

int n = sc.nextInt();
int []a  = new int[n];
System.out.println("enter the array");

for(int i=0;i<n;i++) {
	a[i] = sc.nextInt();
	
}
System.out.println("enter the window size");
int x = sc.nextInt();

for(int i=0;i<x;i++) {
	windsum = windsum +a[i];
}

int maxsum = windsum;
for(int i=x;i<a.length;i++) {
	
	windsum = windsum +  a[i] -a[i-x];
	if(windsum>maxsum) {
		maxsum = windsum;
	}
	
}

System.out.println(maxsum);






}

}

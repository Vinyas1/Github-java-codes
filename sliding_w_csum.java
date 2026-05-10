package javex;
import  java.util.*;
public class sliding_w_csum {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();

int [] a =  new int[n];
for(int i = 0;i<n;i++) {
	a[i] = s.nextInt();
}
int swsize = s.nextInt();
int windowsum = 0;
for(int i=0;i<swsize;i++) {                                               //phase 1 (1st half)
	windowsum =  windowsum + a[i];
	
}

int maxsum = windowsum;

for(int i=swsize;i<n;i++) {
	 windowsum = windowsum +a[i]-a[i-swsize];                               //2nd half
	

if(windowsum > maxsum) {
	maxsum = windowsum;
}
}
System.out.println(maxsum);


	}

}

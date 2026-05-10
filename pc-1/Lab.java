package jav1;

import java.util.Scanner;
public class Lab{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no ");
		int n=s.nextInt();
		System.out.println("the no of prime number b/w 1 and " +n+ "are");
		for(int i=2;i<=n;i++) {
			boolean isprime=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isprime=false;
					break;
					
				}
			}
			if(isprime) {
				System.out.println( +i);
			}
		}
		
	}
}
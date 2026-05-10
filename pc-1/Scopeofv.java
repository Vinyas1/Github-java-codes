package jav1;

public class Scopeofv {
	public static void main (String args[]) {
		int x=10;
		if (x==10) {
			int y=20;
			System.out.println("the value of x and y are " +x +"\t"+y);
			x=y*2;
		}
		System.out.println("value of x is "+x);
	}

}

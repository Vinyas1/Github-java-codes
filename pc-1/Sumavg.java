package jav1;

public class Sumavg {
	public static void main (String args[]) {
		int n[];
	    n=new int [05];
	    int result=0;
		n[1]=35;
		n[2]=55;
		n[3]=50;
		n[4]=85;
		n[0]=05;
		for(int i=0;i<5;i++)
		{
			result=result+n[i];
		}
		System.out.println("the sum of n numbers is "+result);
		System.out.println("th evaerage of these numbers is"+(result/5));
	}

}

package javex;
import java.util.Scanner;
public class bubble {
public static void main (String[] args ) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enetr the number of strings");
	int n;
	n=sc.nextInt();
	String[] fruits =new String[n];
	System.out.println("enter the strings");
	for (int i =0;i<n;i++)
	{
		fruits[i]=sc.next();
	}
	for (int i =0;i<n-i;i++)
	{
		for (int j =0;j<n-i-1;j++)
		{
			if (fruits[j].compareTo(fruits[j+1])>0)
			{
				String temp;
				temp=fruits[j];
				fruits[j]=fruits[j+1];
				fruits[j+1]=temp;
			}
		}
	}
	System.out.println("the sorted srings are");
	for (int i =0;i<n;i++)
	{
		System.out.println(fruits[i]);
	}
sc.close();	
}
}

package javex;
import java.util.*;

public class minsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente rthe size of array");
int n = sc.nextInt();
int [] a = new int[n];
System.out.println("ente elements of array");

for(int i=0;i<n;i++){
    a[i] = sc.nextInt();

}
System.out.println("ente  the target sum");

int x = sc.nextInt();

int minlength = Integer.MAX_VALUE;
System.out.println(n);
System.out.println(Integer.MAX_VALUE);

int left =0;
int sum=0;
for(int i=0;i<n;i++){
 sum = sum +a[i];
 while(sum>=x){
    minlength = Math.min(minlength,i-left+1);
    sum = sum - a[left];
    left++;
 }
}
if(minlength ==Integer.MAX_VALUE) {
	System.out.println("no elemenst found");
}
else {
System.out.println(minlength);
}



    }
}
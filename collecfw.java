package javex;
import java.util.*;
 
public class collecfw {

	public static void main(String[] args) {

ArrayList<Integer> al = new ArrayList<Integer>();

al.add(10);
al.add(50);

al.add(90);
al.add(180);

al.add(160);
al.add(1000);
al.add(1005);
al.add(160);

al.removeIf(x->x==1005);
al.set( 0, 1005);
al.add( 90000);

al.removeIf(x->x%3==0);
Iterator itr = al.listIterator();
while(itr.hasNext()) {
	System.out.print(itr.next() + " ");
}
System.out.println();
System.out.println(Collections.frequency(al, 160));
Collections.sort(al) ;
System.out.println(al);
System.out.println(Collections.binarySearch(al, 50));

Collections.swap(al, 1, 3);
System.out.println(al);
	}

}

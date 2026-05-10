package javex;
import java.util.*;
public class collectionfw {

public static void main(String[] args) {
 ArrayList<Integer> al = new ArrayList<Integer>();
 al.add(10);
 al.add(160);
 al.add(107);
 al.add(150);
 Iterator itr = al.iterator();
 while(itr.hasNext()) {
 	System.out.print(itr.next() + " ");
 }
 System.out.println();
 System.out.println(al.contains(200)); 
 System.out.println(al.indexOf(107));
 System.out.println(al.get(2));
 System.out.println(al.isEmpty());

 al.remove(Integer.valueOf(160));
 al.removeIf(x->x==150);
 al.replaceAll(x->x*100);
 al.removeIf(x->x%2!=0);
 System.out.println(al);
 
 
 ArrayList<Integer> al2 = new ArrayList<Integer>();
 al2.add(478);
 al2.add(825);
al2.addAll(al);
System.out.println(al2);

	}

}

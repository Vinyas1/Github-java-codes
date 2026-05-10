package javex;
import java.util.*;
 
public class jenkins {

	public static void main(String[] args) {

ArrayList<Integer> al = new ArrayList<Integer>();

al.add(10);
al.add(50);

al.add(90);
al.add(180);

al.add(160);
al.add(1000);
al.add(1005);

al.removeIf(x->x==1005);
al.set( 0, 1005);
al.add( 90000);
al.removeIf(x->x%3==0);
Iterator itr = al.listIterator();
while(itr.hasNext()) {
	System.out.print(itr.next() + " ");
}



	}

}

package javex;
import java.util.*;


public class jenkins1 {

	public static void main(String[] args) {

ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

ad.addLast(10);
ad.addLast(89);
ad.addLast(25);
ad.addLast(8421);
ad.addLast(287);
ad.addLast(2588);


Iterator itr = ad.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next() + " ");
}

	}

}

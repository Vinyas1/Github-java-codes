package javex;
import java.util.*;

public class priorityq {

	public static void main(String[] args) {

PriorityQueue<Integer >pq = new PriorityQueue<>(Collections.reverseOrder());    //max heap

pq.add(99);
pq.add(5);
pq.add(89);
pq.add(6);
pq.add(1);

Iterator itr = pq.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next() + " ");
}

	}

}

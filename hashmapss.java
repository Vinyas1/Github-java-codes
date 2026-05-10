package javex;
import java.util.*;
public class hashmapss {

	public static void main(String[] args) {

HashMap<Integer,Integer> hs = new HashMap<>();
hs.put(1,25);
hs.put(23, 77);
hs.put(5,258);
hs.put(2,111);
hs.put(4,58);
hs.put(9,96);

System.out.println(hs);

Set s = hs.keySet();
Iterator itr = s.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next() +" ");
}
System.out.println();


Collection c =  hs.values();
Iterator itr1 = c.iterator();
while(itr1.hasNext()) {
	System.out.print(itr1.next() +" ");
}

System.out.println();

Set s1 =hs.entrySet();
Iterator itr2 = s1.iterator();
while(itr2.hasNext()) {
	System.out.println(itr2.next());
}


	}

}

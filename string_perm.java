package javex;
import java.util.*;

public class string_perm {

	static void perm(String p ,String r) {
	 	  if(r.isEmpty()) {
	 		  System.out.println(p);
	 	  }
	 	  else {
	 		  for(int  i=0;i<r.length();i++) {
	 		  perm(p+r.charAt(i),r.substring(0,i) +r.substring(i+1));
	 		  }
	 	  }
    }
	
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.next();
       perm(" ",input);
       
        
    }
}
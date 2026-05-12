 package javex;
import java.util.*;
public class palindrom {

	static  boolean palindrome(String s) {
 		int i  = 0;                                               //function to check palindrome
		int j= s.length()-1;
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
              return false;
			}
		        i++;
				j--;		
				}	
        return true; 
        
      
        
        

			}
	public static void main(String[] args) {
   Scanner sc  = new Scanner(System.in);
   String str = sc.next();
   
    for(int i=0;i<str.length();i++) {
	   for(int j=i+1;j<=str.length();j++) {
		    String str1 = str.substring(i,j);
		    palindrome(str1);
		    
		    if(palindrome(str1))                     
		   System.out.println(str1);
		    }

	   }
   }
	
	}

}

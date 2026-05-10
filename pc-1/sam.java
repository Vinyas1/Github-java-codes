package jav1;
import java.util.Scanner;
public class sam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
      int n;
        System.out.print("Enter the number of strings to sort: ");
        n = s.nextInt();
     
        String[] fruits = new String[n];

      
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            fruits[i] = s.next();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (fruits[j].compareTo(fruits[j + 1]) > 0) {
                	 String temp;
                     temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
        }

       
        System.out.println("Sorted String Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(fruits[i]);
        }
       
        scanner.close();
    }
}



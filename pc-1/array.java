package jav1;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
    	int numbers[];
        numbers = new int[10]; 
        
        
        numbers[1] = 40;
        numbers[3] = 80;
        numbers[8] = 50;
        numbers[9] = 55;
        numbers[06] = 450;
        numbers[5] = 35;
        
    
        System.out.println("The element at index 6 is: " + numbers[5]);
        System.out.println("if i want to display an element at position 5" +numbers[4]);
        
        
        System.out.println("The array elements are: " + Arrays.toString(numbers));
    }
}

package jav1;

public class multidim {
    public static void main(String args[]) {
        int n[][];
        n = new int[5][6];
        int k = 0;
        
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                n[i][j] = k;
                k = k + 5;
            }
        }
        
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

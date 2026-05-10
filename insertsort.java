package javex;

import java.util.Scanner;

public class insertsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.substring(1, s.length() - 1); // remove [ and ]
        String[] x = s.split(",");

        int[] a = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            a[i] = Integer.parseInt(x[i].trim());
        }

        // Insertion Sort
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        // Output
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

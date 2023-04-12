// WAP to convert a Binary to Decimal.
import java.util.*;
import java.lang.Math;

public class prog_26 {
    public static void main(String[] args) {
        int n;
        double val=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of numbers : ");
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
        }
        
        int i = a.length-1;
        int k=0;
        while (i>=0) {
            val = a[i] * Math.pow(2, k);
            // System.out.println(a[i] + " " + val);
            sum = sum + val;
            i--;
            k++;
        }
        // for printing binary
        System.out.print("Binary : ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        // for printing decimal
        System.out.println();
        System.out.println("Decimal : " + sum);
    }
}

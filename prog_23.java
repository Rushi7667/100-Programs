// WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.*;
public class prog_23 {
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter " + (i+1) + " Element : " );
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value : ");
        int element = sc.nextInt();
        System.out.println("Enter the position : ");
        int position = sc.nextInt();

        a[position] = element;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

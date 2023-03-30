// WAP to sort an Array using insertion sort.

import java.util.Scanner;

public class prog_17 {
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n : ");
        n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " Number :");
            a[i] = sc.nextInt();
        }

        prog_17 call = new prog_17(); 
        call.InsertionSort(a);
    }

    public void InsertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j=i,temp=0;
            while (j>0 && a[j-1]>a[j]) {
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j=j-1;
            }
        }

        System.out.println("Sorted array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}

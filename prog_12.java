// WAP to find Max, Min, Average of n numbers,
// n should be taken from user and all n value should be taken from user
// (Note that you are not allowed to use an array for this)

import java.util.*;
public class prog_12 {
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
        prog_12 func= new prog_12(); 
        func.Max(a);
        func.Min(a);
        func.Avg(a);
    }

    // finding the maximum number from the array
    public void Max(int[] a){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }

        System.out.println("Max number is : " + max);
    }
    
    // finding the minimum number from the array
    public void Min(int[] a){
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }

        System.out.println("Max number is : " + min);
    }

    // finding the average of the array
    public void Avg(int[] a) {
        int avg=0,sum=0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
        }

        avg=sum/a.length;
        System.out.println("average is : " + avg);   
    }
}

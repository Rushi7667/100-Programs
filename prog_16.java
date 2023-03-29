// WAP to sort an Array using Bubble sort.
import java.util.*;

public class prog_16 {

    public static void main(String[] args) {
        int[] a = new int[5];

        int n,temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " Number");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array : ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}

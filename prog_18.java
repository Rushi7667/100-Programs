// WAP to sort an Array using Selection sort.
import java.util.Scanner;

public class prog_18 {
    public void SelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min_index=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min_index]) {
                    min_index=j;
                }
            }

            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter " + i+1 + " number : ");
            a[i] = sc.nextInt();
        }

        prog_18 sort = new prog_18();
        sort.SelectionSort(a);
    }
}

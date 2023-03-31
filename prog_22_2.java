// *********
//  *******
//   *****
//    ***
//     *

import java.util.*;

public class prog_22_2{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value : ");
        n = sc.nextInt();
        int c=n-1;
        // for(int i=0; i<n; i++){

        //     for (int j = 0; j < c+1; j++) {
        //         System.out.print(" ");
        //     }
        //     c--;
        //     for (int j = 0; j < 2*i-1; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
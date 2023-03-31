//     1 
//    A B 
//   2 3 4 
//  C D E F 
// 5 6 7 8 9

import java.util.*;
public class prog_22_1{
    public static void main(String[] args) {
        int n,m,i,j,count=1;
        char ch='A', space=' ';

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = sc.nextInt();
            for (i = 0,m=n-1; i < n; i++,m--) {
            for(j=0;j<m;j++){
                System.out.print(space);
            }
            
            for(j=0; j<i+1; j++){
                if((i%2)==0){
                    System.out.print(count + " ");
                    count++;
                }
                else{
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
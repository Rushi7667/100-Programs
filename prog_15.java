// WAP to convert a Decimal number to BCD.

import java.util.*;

public class prog_15{
    
    public static void BCDConverter(int n)
    {
        if (n == 0) {
            System.out.print("0000");
        }

        int rev = 0;
        
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        // System.out.println(rev);

        while (rev > 0) {

            String b = Integer.toBinaryString(rev % 10); 
            
            // b = String.format("%04d", Integer.parseInt(b));

            System.out.print(b + " ");

            rev /= 10;
        }
    }
public static void main(String[] args) 
{
    int a;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number : ");
    a = sc.nextInt();
    
    BCDConverter(a);
}
}
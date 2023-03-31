// WAP to find a power a^b (without using power and multiplication operation).
import java.util.*;

public class prog_20 {

    public void findPower(int base,int power) {
        int sum=base;
        int multiplication=base;

        for (int i = 1; i < power; i++) {
            for (int j = 1; j < base; j++) {
                sum = sum+multiplication;
            }
            multiplication = sum;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        int power,base;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of base : ");
        base = sc.nextInt();

        System.out.println("Enter the value of power : ");
        power = sc.nextInt();

        prog_20 ans = new prog_20();
        ans.findPower(base,power);
    }
}

package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell you Odd or Even");
        int num = sc.nextInt();

        // Modulus -> %
        // Any num % 2, if result is 0 that num is EVEN, if its 1 then its ODD
        if(num%2 == 0) {
            System.out.println("Num is Even");
        }
        else{
            System.out.println("Num is Odd!");
        }
        sc.close();
    }
}

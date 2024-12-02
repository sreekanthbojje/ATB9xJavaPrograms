package Oct.ex_16102024_Condition_Loops;

import java.util.Scanner;

public class Lab065_Scanner {
    public static void main(String[] args) {
// SCANNER CLASS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        // int age = scanner.nextInt();
        // float age = scanner.nextFloat();
        double age = scanner.nextDouble();

        System.out.println(age > 25 ? "Allowed" : "Not Allowed");

        scanner.close();


    }
}

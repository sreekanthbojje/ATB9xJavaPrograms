package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab066_If {
    public static void main(String[] args) {
        // int age = 20; //HARD CODED

        // Allowed to vote or not
        // If age > 18 -> Allowed to vote
        Scanner sc = new Scanner(System.in); // Arguments using Console
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("Allowed to Vote! ");
        }

    }

}

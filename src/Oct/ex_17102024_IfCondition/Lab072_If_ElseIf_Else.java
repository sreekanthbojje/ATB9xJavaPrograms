package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab072_If_ElseIf_Else {
    public static void main(String[] args) {
//        int num1 = 30; HARD CODED
//        int num2 = 20;
        // Condition1: num1 > num2
        // Condition2: num2 > num1
        // Condition3: num1 == num2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        if(num1 > num2 ) {
            System.out.println("Num1 > Num2");
        }else if(num2 > num1) {
            System.out.println("Num2 > Num1");
        }else{
            System.out.println("Equal");
            }
        }
    }


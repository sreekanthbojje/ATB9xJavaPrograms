package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab075_HackerRankQ2 {
    public static void main(String[] args) {
        // Step 1 : LOGIC BUILDING
        // Input: Side1, Side2, Side3
        // Output: String or Message -> Equilateral/Isosceles/Scalene

        // Step 2:Basic Logic
        // if Side1 == Side2 && Side2 == Side3 && Side1 == Side3 -> Eq
        // Side1 == Side2 || Side2 == Side3 || Side1 == Side3 -> Is
        // else Scalene

        // Step3 : Should check Negative case

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Side1: ");
        double Side1 = sc.nextDouble();

        System.out.println("Enter the length of Side2: ");
        double Side2 = sc.nextDouble();

        System.out.println("Enter the length of Side3: ");
        double Side3 = sc.nextDouble();

        if(Side1<=0 || Side2<=0 || Side3<=0 ) {
            System.out.println("Invalid Input: Sides length must be Positive");
        }else if(Side1 == Side2 && Side2 == Side3 && Side1 == Side3){
            System.out.println("Triangle is Equilateral");
        }else if(Side1 == Side2 || Side2 == Side3 || Side1 == Side3){
            System.out.println("Triangle is Isosceles");
        }else{
            System.out.println("Triangle is Scalene");
        }
        sc.close();
    }
}

package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab074_HackerRankQ {
    public static void main(String[] args) {
        // Input is Score (0 to 100) -> datatype int
        // Output is Grade -> datatype is char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();
        char grade = 'F';

        if(score>=90 && score<=100) {
            grade = 'A';
        } else if(score>=80 && score<=89){
            grade = 'B';
        } else if(score>=70 && score<=79){
            grade = 'C';
        } else if(score>=60 && score<=69){
            grade = 'D';
        } else if (score<=0 || score>100){
            System.out.println("Are you God ?");
            grade = 'O';
        } else{
            grade = 'F';
        }
        System.out.println("Your grade is -> " + grade);
    }
}

package Oct.ex_15102024_Ternary_Operators;

public class Lab062 {
    public static void main(String[] args) {
       // NESTED TERNARY
        // int result = condition1 ? expression1 : (condition2 ? expression2) : (condition3 ? expression3);

        // If score is 90 or above, grade is 'A'
        // If score is between 80 and 89, grade is 'B'
        // If score is between 70 and 79, grade is 'C'
        // If score is between 60 and 69, grade is 'D'
        // If score is below 60, Fail

        int score = 69;
        String grade = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>60) ? "D" : "F";
        System.out.println("Your grade is " + grade);
        System.out.printf("Your grade is %s", grade); // STRING FORMATTING, We can also use %d

    }
}

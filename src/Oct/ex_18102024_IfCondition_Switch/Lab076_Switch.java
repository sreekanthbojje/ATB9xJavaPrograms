package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab076_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from(1 to 7)");
        int day  = sc.nextInt();
        switch(day){
            case 1:
              System.out.println("Mon");
              break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No Idea, what day ?");
                break;
        }
        System.out.println("End of Loop");
    }
}

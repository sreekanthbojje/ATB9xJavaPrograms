                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser: ");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch(browser){
            case "Chrome" :
                System.out.println("Starting Chrome Browser");
                break;

            case "Firefox" :
                System.out.println("Starting Firefox Browser");
                break;

            case "Edge" :
                System.out.println("Starting Edge Browser");
                break;

            default:
                System.out.println("No Idea about the Browser");
                break;
        }
    }
}

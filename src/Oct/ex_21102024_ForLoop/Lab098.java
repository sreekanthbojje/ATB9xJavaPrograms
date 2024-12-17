package Oct.ex_21102024_ForLoop;

public class Lab098 {
    public static void main(String[] args) {
        // To find the Even numbers from 1 to 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i  + " is an " + "Even Number ");
            } else {
                System.out.println("Odd");
            }
        }
    }
}

package Oct.ex_16102024_Condition_Loops;

public class Lab064_Arguments_Console {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s, %s, %s", args[0], args[1], args[2]);
        int age = Integer.parseInt(args[1]);
        // Integer.parseInt function is used here to convert String into Integer
        System.out.println();
        System.out.println(age > 25 ? "Allowed" : "Not Allowed");


    }

}

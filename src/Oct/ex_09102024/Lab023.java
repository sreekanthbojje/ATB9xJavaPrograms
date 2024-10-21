package Oct.ex_09102024;

public class Lab023 {
    int instance_variable = 10; // Instance variable
    static int static_variable = 10; // Static variable

    public static void main(String[] args) {
        int age = 10; // Local Variable
        {
            int sachin = 10;
            System.out.println(sachin); // WITHIN {}

        }
       // System.out.println(sachin); // NOT OUTSIDE {}
    }
}

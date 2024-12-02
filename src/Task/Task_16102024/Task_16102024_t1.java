package Task.Task_16102024;

public class Task_16102024_t1 {
    public static void main(String[] args) {
        // Find the largest of 3 nos a,b,c using Ternary Operator
        // condition ? value_if_true : value_if_false;

        int a = 10;
        int b = 20;
        int c = 15;

        // a>=b && a>=c -> a : b>=c -> b : c
        int result = (a>=b && a>=c) ? a : (b>=c  ? b : c);
        System.out.println("Max number is -> " + result);



    }
}

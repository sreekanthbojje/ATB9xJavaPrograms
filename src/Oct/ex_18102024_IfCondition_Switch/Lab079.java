package Oct.ex_18102024_IfCondition_Switch;

public class Lab079 {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch) {
            case 65:
            System.out.println("A");
        }
//        boolean b = true; INVALID BCOZ BOOLEANS ARE NOT ALLOWED
//        switch(b){}
        long a11 = 30l;
        switch((int) a11){} // VALID
    }
}

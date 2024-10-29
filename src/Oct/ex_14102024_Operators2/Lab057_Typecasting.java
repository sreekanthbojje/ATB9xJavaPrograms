package Oct.ex_14102024_Operators2;

public class Lab057_Typecasting {
    public static void main(String[] args) {
        // Type Casting
        // Widening : Implicit, Explicit- Looseless
        // Narrowing : Implicit, Explicit- Loose

        // Widening:
        byte b = 10;
        int a = b; // Valid -> Implicit casting by JVM
        int a1 = (int)b; // Valid -> Explicit casting by JVM

        // Narrowing -> Converting large datatype into small
        int val = 200;
        // byte b2 = val; // Invalid Implicit by JVM
        byte b3 = (byte)val; // Valid Explicitly by User

    }
}

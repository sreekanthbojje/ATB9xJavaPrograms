package Oct.ex_14102024_Operators2.TYPECASTING;

public class Lab058_Typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing Not possible
        short s = (short)phone_no; //Explicitly by User. We will loss the data
    }
}

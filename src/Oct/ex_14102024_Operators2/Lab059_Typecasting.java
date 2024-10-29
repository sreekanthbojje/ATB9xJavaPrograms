package Oct.ex_14102024_Operators2;

public class Lab059_Typecasting {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45F;
        int total_price = course+(int)gst; // Narrowing Explicitly by User
        System.out.println(total_price);



    }
}

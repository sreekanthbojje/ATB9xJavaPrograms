package Oct.ex_21102024_ForLoop;

public class Lab088 {
    public static void main(String[] args) {
        // NO DIFF, WHETHER ITS PRE OR POST INCREMENT
        for(int i = 0; i < 10; ++i){
            System.out.println(i);
        }
        for(int j = 0; j > 1; j++ ){
            System.out.println(j);
        }
        System.out.println("End");
    }
}

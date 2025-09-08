package user_input;

import java.io.IOException;

public class userinput83 {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        System.out.println("inter the number");
        try {
            int numm = System.in.read();
            System.out.println(numm+1);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}

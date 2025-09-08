package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num =Integer.parseInt(bf.readLine()) ;
        System.out.println("the no you entered is:"+ num);
        bf.close();
    }
    
}

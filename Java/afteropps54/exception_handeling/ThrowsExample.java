import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Method that declares it throws IOException
    public static void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        System.out.println("First line: " + line);
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile("76 What is Exception in Java");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
}

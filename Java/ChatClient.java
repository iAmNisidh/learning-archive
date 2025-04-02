import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Change this if the server is on another machine
        int port = 8080; // Same port as the server

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to the chat server!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Read welcome message from the server
            System.out.println("Server: " + input.readLine());

            // Start chatting
            String message;
            while (true) {
                System.out.print("You: ");
                message = userInput.readLine(); // Read message from the user

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Disconnecting...");
                    break;
                }

                output.println(message); // Send message to server
                System.out.println("Server: " + input.readLine()); // Read response from server
            }

            socket.close(); // Close connection

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
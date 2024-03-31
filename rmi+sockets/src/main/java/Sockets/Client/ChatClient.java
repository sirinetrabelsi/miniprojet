package main.java.Sockets.Client;

import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Connected to ChatServer. Type 'exit' to quit.");

            Thread inputThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = reader.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    System.err.println("Error reading from server: " + e.getMessage());
                }
            });
            inputThread.start();

            String userInput;
            while ((userInput = consoleReader.readLine()) != null) {
                writer.println(userInput);
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            inputThread.join();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error in ChatClient: " + e.getMessage());
        }
    }
}

package main.java.Sockets.Server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static final Set<PrintWriter> clients = new HashSet<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("ChatServer started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket);

                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                clients.add(writer);

                Thread clientHandler = new Thread(new ClientHandler(clientSocket, writer));
                clientHandler.start();
            }
        } catch (IOException e) {
            System.err.println("Error in the server: " + e.getMessage());
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;
        private final PrintWriter writer;

        public ClientHandler(Socket clientSocket, PrintWriter writer) {
            this.clientSocket = clientSocket;
            this.writer = writer;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println("Received message from client: " + message);
                    broadcast(message);
                }
            } catch (IOException e) {
                System.err.println("Error handling client: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                    clients.remove(writer);
                } catch (IOException e) {
                    System.err.println("Error closing socket: " + e.getMessage());
                }
            }
        }

        private void broadcast(String message) {
            for (PrintWriter client : clients) {
                client.println(message);
                client.flush();
            }
        }
    }
}

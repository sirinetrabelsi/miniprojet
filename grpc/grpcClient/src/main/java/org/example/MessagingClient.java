package org.example;

import com.msg_gRPC.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.msg_gRPC.grpc.*;
public class MessagingClient {

    private final ManagedChannel channel;
    private final ServiceMessagerieGrpc.ServiceMessagerieBlockingStub blockingStub;

    public MessagingClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.blockingStub = ServiceMessagerieGrpc.newBlockingStub(channel);
    }

    public void shutdown() {
        channel.shutdown();
    }

    public void sendMessage(Message message) {
        Confirmation confirmation = blockingStub.envoyerMessage(message);
        if (confirmation.getReussite()) {
            System.out.println("Message sent successfully!");
        } else {
            System.out.println("Failed to send message: " + confirmation.getMessageErreur());
        }
    }

    public ListeMessages retrieveMessages(Utilisateur utilisateur) {
        return blockingStub.recupererMessages(utilisateur);
    }

    public static void main(String[] args) {
        MessagingClient client = new MessagingClient("localhost", 50051);

        // Sending a message
        Message message = Message.newBuilder()
                .setExpediteur("Alice")
                .setDestinataire("Bob")
                .setContenu("Hello, Bob!")
                .build();
        client.sendMessage(message);

        // Retrieving messages for a user
        Utilisateur utilisateur = Utilisateur.newBuilder()
                .setNomUtilisateur("Bob")
                .build();
        ListeMessages listeMessages = client.retrieveMessages(utilisateur);
        for (Message msg : listeMessages.getMessagesList()) {
            System.out.println("Received message from " + msg.getExpediteur() + ": " + msg.getContenu());
        }

        client.shutdown();
    }
}

package MessagingService;

import com.msg_gRPC.grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class MessagingServiceImpl extends ServiceMessagerieGrpc.ServiceMessagerieImplBase {

    private List<Message> messageList = new ArrayList<>();

    @Override
    public void envoyerMessage(Message request, StreamObserver<Confirmation> responseObserver) {
        // Implementation to send a message

        messageList.add(request);

        // Sending confirmation
        Confirmation confirmation = Confirmation.newBuilder()
                .setReussite(true)
                .build();
        responseObserver.onNext(confirmation);
        responseObserver.onCompleted();
    }

    @Override
    public void recupererMessages(Utilisateur request, StreamObserver<ListeMessages> responseObserver) {
        // Implementation to retrieve messages for a user
        List<Message> userMessages = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getDestinataire().equals(request.getNomUtilisateur())) {
                userMessages.add(message);
            }
        }

        // Sending the list of messages
        ListeMessages listeMessages = ListeMessages.newBuilder()
                .addAllMessages(userMessages)
                .build();
        responseObserver.onNext(listeMessages);
        responseObserver.onCompleted();
    }
}

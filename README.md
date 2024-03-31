# Guide de déploiement et de test de l'application de communication distribuée en Java

Ce guide fournit des instructions sur la manière de déployer et de tester l'application de communication distribuée en Java utilisant les technologies Java RMI, gRPC et les sockets.

## Déploiement de l'application

 **Accès au répertoire :** Accédez au répertoire de l'application clonée :

    le dossier grpc contient le serveur(grpc/msg_gRPC/src/main/java/server/MessagingServer.java) et client(grpc/grpcClient/src/main/java/org/example/MessagingClient.java) grpc
    le dossier rmi+sockets/src/main/java contient : 1- Dossier RMI contient le serveur(miniprojet/rmi+sockets/src/main/java/RMI/Server/ServeurGestionnaireTaches.java) et le client(miniprojet/rmi+sockets/src/main/java/RMI/Client/ClientGT.java) RMI
                                                    2- Dossier Sockets contient le serveur(rmi+sockets/src/main/java/Sockets/Server/ChatServer.java) et le client(rmi+sockets/src/main/java/Sockets/Client/ChatClient.java) Sockets


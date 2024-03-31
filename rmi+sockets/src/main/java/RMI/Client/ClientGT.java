package main.java.RMI.Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import main.java.RMI.Server.*;
public class ClientGT {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            RMI.Server.GestionnaireTaches stub = (RMI.Server.GestionnaireTaches) registry.lookup("GestionnaireTaches");

            // Utilisation du stub pour appeler les méthodes distantes
            stub.ajouterTache("Faire les courses");
            stub.ajouterTache("Appeler le client");

            List<String> taches = stub.recupererToutesTaches();
            System.out.println("Tâches :");
            for (String tache : taches) {
                System.out.println(tache);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


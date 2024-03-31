package main.java.RMI.Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class ServeurGestionnaireTaches extends UnicastRemoteObject implements RMI.Server.GestionnaireTaches {
    private List<String> taches;

    public ServeurGestionnaireTaches() throws RemoteException {
        taches = new ArrayList<>();
    }

    //@Override
    public void ajouterTache(String tache) throws RemoteException {
        taches.add(tache);
        System.out.println("Tâche ajoutée : " + tache);
    }

    //@Override
    public void supprimerTache(String tache) throws RemoteException {
        taches.remove(tache);
        System.out.println("Tâche supprimée : " + tache);
    }

    //@Override
    public List<String> recupererToutesTaches() throws RemoteException {
        return taches;
    }

    public static void main(String[] args) {
        try {
            ServeurGestionnaireTaches serveur = new ServeurGestionnaireTaches();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("GestionnaireTaches", serveur);
            System.out.println("ServeurGestionnaireTaches prêt.");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

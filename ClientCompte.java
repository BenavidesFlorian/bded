import java.rmi.*;



public class ClientCompte {

    public static void main(String args[]) {

        try {
            Compte c = (Compte) Naming.lookup("objectcompte");
            String messageRecu = c.getSolde();
            System.out.println(messageRecu);
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}

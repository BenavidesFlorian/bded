import java.rmi.*;
import java.util.Scanner;


public class ClientCompte {

    public static void main(String args[]) {

            Scanner scanner = new Scanner( System.in );
            try {
                Compte c = (Compte) Naming.lookup("objectcompte");
                int choix = 0;
                do
                {
                    
                    String menu = "Menu : \n"+
                                   "0 : Quitter \n"+
                                   "1 : Créer un compte \n"+
                                   "2 : Dépôt \n"+
                                   "3 : Retrait \n"+
                                   "4 : Consultation solde \n"+
                                   "5 : Consultation opération\n\n";
                    System.out.println(menu);
                    choix = scanner.nextInt();
                    int montant=0;
                    String message = "";
                    switch(choix) {
                    case 0:
                    message = "fermeture ...";
                    break;
                    case 1:
                    // on sait pas
                    break;
                    case 2:
                    System.out.println("Montant de la transaction:");
                    montant = scanner.nextInt();
                    message = c.Depot(montant);
                    break;
                    case 3:
                    System.out.println("Montant de la transaction:");
                    montant = scanner.nextInt();
                    message = c.Retrait(montant);
                    break;
                    case 4:
                    message = c.Consultation();
                    break;
                    case 5:
                    message = c.ConsultationOp();
                    break;
                    }
                    System.out.println(message+"\n\n");
                }while(choix != 0);
    
            } catch (Exception e) {
                System.err.println("Erreur : " + e);
            }
        
    }
}

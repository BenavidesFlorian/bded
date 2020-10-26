import java.util.*;
import java.rmi.*;
import java.net.*;
import java.rmi.server.*;


public class ImpCompte extends UnicastRemoteObject implements Compte {

            private String nCp;
            private String nom;
            private String prenom;
            private int solde;
            private List<String> listeOp;

    
            public String getNCp()
            {
                return this.nCp;
            }
            public String getNom()
            {
                return this.nom;
            }
            public String getPrenom()
            {
                return this.prenom;
            }
            public int getSolde()
            {
                return this.solde;
            }
            public void setSolde(int i)
            {
                this.solde=i;
            }

            public List<String> getListeOp()
            {
                return this.listeOp;
            }

            public ImpCompte() throws RemoteException
            {
                super();
                this.nCp= "1";
                this.nom= "Beltramo";
                this.prenom= "Emeric";
                this.solde= 0;
                this.listeOp=new ArrayList<String>();
            }

            public ImpCompte(String cp,String n, String p, int s, List<String> L) throws RemoteException
            {
                super();
                this.nCp= cp;
                this.nom= n;
                this.prenom= p;
                this.solde= s;
                this.listeOp= L;
            }

            public ImpCompte(String cp,String n, String p, int s) throws RemoteException
            {
                super();
                this.nCp= cp;
                this.nom= n;
                this.prenom= p;
                this.solde= s;
                this.listeOp=new ArrayList<String>();
            }

            public ImpCompte(String cp) throws RemoteException
            {
                super();
                this.nCp= cp;
                this.nom= "";
                this.prenom= "";
                this.solde= 0;
                this.listeOp= new ArrayList<String>();
            }

            public String Depot(int somme)
   		    {
       		
        	this.setSolde(this.getSolde()+somme);
        	this.listeOp.add("Dépot de "+somme+"€");
            String message = "Vous avez effectuée un dépot de: " + somme + "€";
            return message;
    		}
    
    	    public String Retrait(int somme)
    		{
    			String message = "Vous avez effectuée un débit de: " + somme + "€";
        		this.setSolde(this.getSolde()-somme);
        		this.listeOp.add("Retrait de "+somme+"€");
                return message;
    		}
    
    	    public String Consultation()
    		{
        		String message = "Votre solde est de: "+this.getSolde() + "€";
                this.listeOp.add("Consultation du solde");
                return message;
    		}
    
            public String ConsultationOp()
    		{
        		String message = "Voici vos dernieres operations: "+this.getListeOp().toString();
                this.listeOp.add("Consultation des operations");
                return message;
    		}


            public static void main(String args[])throws Exception
            {   
                try {
                ImpCompte s = new ImpCompte();
                String nom = "objectcompte";
                Naming.rebind(nom, s); // enregistrement
                System.out.println("Serveur enregistré.");
                } catch (Exception e) {
                System.err.println("Erreur : " + e);
                }
	        }
}

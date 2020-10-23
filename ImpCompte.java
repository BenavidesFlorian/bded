import java.util.Scanner;
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

            public void Depot(int somme)
   		    {
       		System.out.println("Vous avez effectuée un dépot de: " + somme + "€");
        	this.setSolde(this.getSolde()+somme);
        	this.listeOp.add("Dépot de "+somme+"€");
    		}
    
    	    public void Retrait(int somme)
    		{
    			System.out.println("Vous avez effectuée un débit de: " + somme + "€");
        		this.setSolde(this.getSolde()-somme);
        		this.listeOp.add("Retrait de "+somme+"€");
    		}
    
    	    public void Consultation()
    		{
        		System.out.println("Votre solde est de: "+this.getSolde() + "€");
                this.listeOp.add("Consultation du solde");
    		}
    
            public void ConsultationOp()
    		{
        		System.out.println("Voici vos dernieres operations: "+this.getListeOp().toString());
                this.listeOp.add("Consultation des operations");
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

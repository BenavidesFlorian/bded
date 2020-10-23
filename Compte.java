import java.util.Scanner;
package Banque;

public class Compte
{
            private String nCp;
            private String nom;
            private String premon;
            private int solde;
            private List<String> liste;
    
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
            public List<Operations> getListe()
            {
                return this.liste;
            }

            public Compte(String cp,String n, String p, int s, List<> L)
            {
                this.nCp= cp;
                this.nom= n;
                this.prenom= p;
                this.solde= s;
                this.Liste= L;
            }

            public void Depot(int somme)
   		{
       		System.out.println("Vous avez effectuée un dépot de: " + somme + "€");
        	c.setSolde(c.getSolde()+somme);
        	this.
    		}
    
    	    public void Retrait(int somme)
    		{
    			System.out.println("Vous avez effectuée un débit de: " + somme + "€");
        		c.setSolde(c.getSolde()-somme);
        		this.type="Retrait";
    		}
    
    	    public void Consultation()
    		{
        		this.type="Consultation";
        		System.out.println("Votre solde est de: "+c.getSolde() + "€");
    		}


            public static void main(String args[])throws Exception
            {     
                
	    }


            
            

}

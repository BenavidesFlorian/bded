import java.util.Scanner;
package Banque;

public class Compte
{
            private String nCp;
            private String nom;
            private String premon;
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
            public List<String> getListeOp()
            {
                return this.listeOp;
            }

            public Compte(String cp,String n, String p, int s, List<> L)
            {
                this.nCp= cp;
                this.nom= n;
                this.prenom= p;
                this.solde= s;
                this.listeOp= L;
            }

            public void Depot(int somme)
   		    {
       		System.out.println("Vous avez effectuée un dépot de: " + somme + "€");
        	c.setSolde(c.getSolde()+somme);
        	this.ListeOp.add("Dépot de "+somme+"€");
    		}
    
    	    public void Retrait(int somme)
    		{
    			System.out.println("Vous avez effectuée un débit de: " + somme + "€");
        		c.setSolde(c.getSolde()-somme);
        		this.ListeOp.add("Retrait de "+somme+"€");
    		}
    
    	    public void Consultation()
    		{
        		this.type="Consultation";
        		System.out.println("Votre solde est de: "+c.getSolde() + "€");
                this.ListeOp.add("Consultation du solde, "+somme+"€");
    		}


            public static void main(String args[])throws Exception
            {     
                
	    }


            
            

}

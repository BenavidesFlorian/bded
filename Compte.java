import java.util.Scanner;
package Banque;

public class Compte
{
            private String nCp;
            private String nom;
            private String premon;
            private int solde;
            private List<Operations> liste;
    
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

            public Operation(String opNom, int somme)
            {
                OperationFactory opFact = new OperationFactory();

                //get an object of Circle and call its draw method.
                 op = OperationFactory.getOperation(opNom);
                 this.solde=op.operation(this, somme);

            }


            public static void main(String args[])throws Exception
            {     
                
			}


            
            

}

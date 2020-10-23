public class Depot implements Operations {

   @Override
   public void Operation(Compte c, int somme)
   {
      return c.solde+somme;
   }
}

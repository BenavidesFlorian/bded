import java.util.*;
import java.rmi.*;
import java.net.*;
import java.rmi.server.*;

public class ImpBanque extends UnicastRemoteObject implements Banque {
    private List<ImpCompte> listCompte;

    public ImpBanque() throws RemoteException {
        super();
        this.listCompte = new ArrayList<ImpCompte>();
    }    

    public void CreationCompte(int ncp) throws RemoteException
    {
        ImpCompte c = new ImpCompte(ncp);
        this.listCompte.add(c);
    }

    public void SaveCompte(ImpCompte cp) throws RemoteException
    {
        int index = listCompte.indexOf(cp);
        listCompte.set(index,cp);
    }

    public Compte SelectionCompte(int ncp) throws RemoteException
    {
        for (ImpCompte cp : this.listCompte) {
            if (cp.getNCp() == ncp) {
                System.out.println(cp);
                return cp;
            }
        }
        return null;
    }    

    public static void main(String args[])throws Exception
    {   
        try {
        ImpBanque s = new ImpBanque();
        String nom = "banque";
        Naming.rebind(nom, s); // enregistrement
        System.out.println("Serveur enregistré.");
        } catch (Exception e) {
        System.err.println("Erreur : " + e);
        }
    }
}

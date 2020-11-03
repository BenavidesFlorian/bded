import java.rmi.*;

public interface Banque extends Remote {
    public void CreationCompte(int ncp) throws RemoteException;
    public Compte SelectionCompte(int ncp) throws RemoteException;
}

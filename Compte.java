import java.rmi.*;

public interface Compte extends Remote {
    public void Depot(int somme) throws java.rmi.RemoteException;
    public void Retrait(int somme) throws java.rmi.RemoteException;
    public void Consultation() throws java.rmi.RemoteException;
    public void ConsultationOp() throws java.rmi.RemoteException;
    public int getSolde() throws java.rmi.RemoteException;
} 

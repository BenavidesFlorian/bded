import java.rmi.*;

public interface Compte extends Remote {
    public String Depot(int somme) throws java.rmi.RemoteException;
    public String Retrait(int somme) throws java.rmi.RemoteException;
    public String Consultation() throws java.rmi.RemoteException;
    public String ConsultationOp() throws java.rmi.RemoteException;
    public int getSolde() throws java.rmi.RemoteException;
} 

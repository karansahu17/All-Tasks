package task2_0.RMIServer;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerIntf extends Remote {
	public int sum(int a, int b) throws RemoteException;
}

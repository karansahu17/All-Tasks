package task2_0.RMIServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf {

	protected AddServerImpl() throws RemoteException {
		super();
	}

	@Override
	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

}

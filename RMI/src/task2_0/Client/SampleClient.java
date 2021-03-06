package task2_0.Client;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import task2_0.RMIServer.AddServerImpl;

public class SampleClient {
	public static void main(String[] args) {
	System.setSecurityManager(new RMISecurityManager());

		try {
			String uri = "rmi://localhost:1099/ADD-SERVER";
			AddServerImpl remoteObject = (AddServerImpl) Naming.lookup(uri);
			System.out.println("SUM = " + remoteObject.sum(2, 8));
		} catch (RemoteException e) {
			System.out.println("Error in lookup:");
		} catch (MalformedURLException e) {
			System.out.println("Error in lookup:");
		} catch (NotBoundException e) {
			System.out.println("Error in lookup:");
		}
	}
}

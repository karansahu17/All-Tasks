package task2_0.RMIServer;

/*Write a program to implement RMI Add Server. Server will contain remote method sum(int,int) that will be called by
 Client to sum the two numbers.

Exercise 

1.Why do you make Remote Interface?
  Its purpose is simply to indicate that an interface uses remote methods.
2.Why RemoteException is thrown by each remote method?
  A RemoteException is the common superclass for a number of communication-related exceptions that may occur during the 
  execution of a remote method call
  Because remote method invocation may fail in many ways, like server down, resources unavailable, the method itself may
  throw exception, etc. If the failure happens, the client should be able to know it via the RemoteException.
3.Why do you use RMI Registry?
  The Java RMI registry is a remote object that maps names to remote objects.
4.Why Security Manager is installed?
  The security manager is a class that allows applications to implement a security policy. It allows an application to 
  determine, before performing a possibly unsafe or sensitive operation, what the operation is and whether it is being 
  attempted in a security context that allows the operation to be performed. The application can allow or disallow the 
  operation.
5.What is policy file?
6.What are Skeleton and Stub? Do we need skeleton in modern version of Java?
  Stub:
   It initiates a connection with remote Virtual Machine (JVM),
   It writes and transmits (marshals) the parameters to the remote Virtual Machine (JVM),
   It waits for the result
   It reads (unmarshals) the return value or exception, and
   It finally, returns the value to the caller.
  skeleton:
   It reads the parameter for the remote method
   It invokes the method on the actual remote object, and
   It writes and transmits (marshals) the result to the caller.
 */


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class RemoteServer {
	public static void main(String[] args) throws RemoteException,
			MalformedURLException {
System.setSecurityManager(new RMISecurityManager());

		AddServerImpl serverImpl = new AddServerImpl();
		Naming.rebind("ADD-SERVER", serverImpl);

		System.out.println("Server is waiting....");
	}
}

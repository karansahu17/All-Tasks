/*Write a multithreaded EchoServer that will handle concurrent clients. It will receive a string from a Client and send
 same string back to the Client.
EchoClient will establish a connection with server, read text from keyboard and keep on sending to the server. 
Client will print server response on Console. When Client send string “Bye” to server then server will close connection. 
Client and Server both will use TCP channel to communicate with each other.

Exercise 

1.Which classes are used to make TCP connection?
2.Which exceptions are thrown by ServerSocket or Socket classes while instantiation and communication?
3.Why TCP is called reliable connection ?
4.Why do you use port number greater than or equals to 1024?*/

package in.co.sunrays.echoserver;

import in.co.multithread.MultiThreadedEchoServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(4480);
		Socket socket = null;
		MultiThreadedEchoServer multiThreadedEchoServer = null;
		boolean flag = true;
		while (flag) {
			socket = serverSocket.accept();
			multiThreadedEchoServer = new MultiThreadedEchoServer(socket);
			multiThreadedEchoServer.start();
		}
		System.out.println("Server stopped");
		serverSocket.close();
	}
}

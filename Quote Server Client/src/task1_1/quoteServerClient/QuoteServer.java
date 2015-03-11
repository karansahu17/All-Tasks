/*Write a Quote Server and Quote Client using UDP protocol. QuoteServer will send a random quote to the Client when it 
 receives an empty packet from Client.

Quote Client will send an empty packet to Server and receive a packet containing quote from server and display quote on 
console.

Exercise 

1.Which classes are used to make UDP connection?
2.Which exceptions are thrown by DatagramSocket while instantiation and communication?
3.Why InetAddress class is required?
4.What are differences between TCP and UDP?*/

package task1_1.quoteServerClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuoteServer {
	public static void main(String[] args) throws IOException {
		try (DatagramSocket socket = new DatagramSocket(4450);) {

			String[] quote = { "Work hard is only key to success.",
					"Life starts at the end of your confront zone.",
					"Sanyas hriday ki ek sithiti ka naam hai" };

			byte[] buf = new byte[256];

			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			boolean flag = true;
			while (flag) {
				socket.receive(packet);
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				int ind = (int) (Math.random() * 2);
				String sendingQoute = quote[ind];
				byte[] newBuf = sendingQoute.getBytes();

				DatagramPacket newPacket = new DatagramPacket(newBuf,
						sendingQoute.length(), address, port);
				socket.send(newPacket);
			}
		} catch (Exception e) {
		}

	}
}
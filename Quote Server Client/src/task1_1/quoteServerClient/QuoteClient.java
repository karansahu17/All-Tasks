package task1_1.quoteServerClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuoteClient {
	public static void main(String[] args) {
		try (DatagramSocket socket = new DatagramSocket()) {

			// send request
			byte[] buf = new byte[256];
			InetAddress address = InetAddress.getByName("localhost");
			DatagramPacket packet = new DatagramPacket(buf, buf.length,
					address, 4450);
			socket.send(packet);

			// get response
			packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);

			// display response
			String recieved = new String(packet.getData());
			System.out.println("Todays Qoute: " + recieved);
		} catch (Exception e) {
		}
	}

}

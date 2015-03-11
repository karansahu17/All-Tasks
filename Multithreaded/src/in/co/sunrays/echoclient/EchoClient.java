package in.co.sunrays.echoclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		try (Socket socket = new Socket("localhost", 4480);
				PrintWriter writer = new PrintWriter(socket.getOutputStream(),
						true);
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(System.in));) {

			String line = bufferedReader.readLine();
			while (line != null) {
				writer.println(line);
				System.out.println("Echo: " + reader.readLine());
				if ("Bye".equalsIgnoreCase(line))
					break;
				line = bufferedReader.readLine();
			}
		} catch (Exception e) {

		}
	}
}

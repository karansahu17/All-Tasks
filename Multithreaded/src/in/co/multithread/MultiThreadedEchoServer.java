package in.co.multithread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadedEchoServer extends Thread {
	private Socket socket;

	public MultiThreadedEchoServer(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (PrintWriter writer = new PrintWriter(socket.getOutputStream(),
				true);
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));) {

			String inputLine = reader.readLine();
			while (inputLine != null) {
				System.out.println("Server recieved: " + inputLine);
				writer.println(inputLine + " " + inputLine);
				if ("bye".equalsIgnoreCase(inputLine))
					break;
				inputLine = reader.readLine();
			}
		} catch (Exception e) {
		}

	}
}

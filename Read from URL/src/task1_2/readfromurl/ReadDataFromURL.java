/*Write a program that will read data from a URL and display it on Console.

Exercise 

1.Which exceptions are thrown by URL while making a connection and reading from it.*/

package task1_2.readfromurl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ReadDataFromURL {
	public static void main(String[] args) throws MalformedURLException,
			IOException {
		InputStream inputStream = null;

		URL yahoo = new URL("http://www.yahoo.co.in");

		URLConnection yahooConnection = yahoo.openConnection();
		yahooConnection.connect();

		inputStream = yahooConnection.getInputStream();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(inputStream);
		while (in.hasNext()) {
			System.out.println(in.nextLine());
		}
	}
}

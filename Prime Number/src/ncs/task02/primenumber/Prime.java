package ncs.task02.primenumber;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) throws IOException {

		InputStream inStream = null;  URL u = null;
		try {
		u = new URL("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=google");
		inStream = u.openStream();

		} catch (Exception e) {
		System.out.println("Error in URL");
		System.exit(0);
		}

		Scanner in = new Scanner(inStream);
		while (in.hasNext()) {
			System.out.println(in.nextLine());
		}
		in.close();
		}

}

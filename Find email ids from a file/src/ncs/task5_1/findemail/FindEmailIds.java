/*Write a program that read all email ids from a text file and display at console. 

Use regular expression pattern to identify email ids 
Use regular following regular expression to search an email 

String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";*/

package ncs.task5_1.findemail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FindEmailIds {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("D:/Companies id.txt");
		BufferedReader br = new BufferedReader(file);

		File fileWriter = new File("D:/second.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		String line = br.readLine();
		int i = 1;
		String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		while (line != null) {
			String token = null;
			StringTokenizer tokenizer = new StringTokenizer(line, " ");
			// System.out.println(tokenizer);
			while (tokenizer.hasMoreTokens()) {
				token = tokenizer.nextToken();

				if (token.matches(regex)) {
					System.out.println(i + ". " + token);
					i++;
					printWriter.print(token);
				}
			}
			line = br.readLine();
		}
	}
}

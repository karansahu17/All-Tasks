package ncs.task3_1.propagateexception;

import java.util.HashMap;
import java.util.Scanner;

/*1.Create a custom checked exception LoginException 
  2.Write a program that propagates LoginException up to JVM*/

public class PropagateException {

	static HashMap<String, String> user;
	static Scanner sc;

	public static void main(String[] args) throws LoginException {
		init();
		verifyUser();
		System.out.println("Login Successful");
	}	

	private static void init() {
		user = new HashMap<String, String>();
		user.put("admin", "pass123");

	}

	private static void verifyUser() throws LoginException{
		sc = new Scanner(System.in);
		System.out.println("Enter Login name and password");
		String name = sc.next();
		if (user.containsKey(name))
			if (user.get(name).equals(sc.next())) 
				return;
			else 
				throw new LoginException("Password not correct");
		else
			throw new LoginException("UserId not correct");
	}

}

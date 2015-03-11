package ncs.task3_1.propagateexception;

public class LoginException extends Exception {
	public LoginException(String msg) {
		super("Login not found: " + msg);
	}
}

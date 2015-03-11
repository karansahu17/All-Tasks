package ncs.task2_5.shallowdeepcloning;

public class Account implements Cloneable {
	private String number;
	private String accountType;
	private double balance;
	private Test test;

	public Account(String number, String accountType, double balance, Test t) {
		super();
		this.number = number;
		this.accountType = accountType;
		this.balance = balance;
		this.test = t;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double bal, double amt) {
		bal += amt;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Account account = (Account) super.clone();
		account.test = (Test) test.clone();
		return account;
	}

}

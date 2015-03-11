package ncs.task2_5.shallowdeepcloning;

public class CustomerS implements Cloneable {
	private int customerId;
	private String name;
	private Account account;

	public CustomerS(int customerId, String name, Account account) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.account = account;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

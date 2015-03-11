package ncs.task2_5.shallowdeepcloning;

public class CustomerD implements Cloneable{
	private int customerId;
	private String name;
	private Account account;

	public CustomerD() {
	}

	public CustomerD(int customerId, String name, Account account) {
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
		CustomerD customerD = (CustomerD) super.clone();
		customerD.account = (Account) account.clone();
		return customerD;
	}
}

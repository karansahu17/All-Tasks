package ncs.task2_5.shallowdeepcloning;

public class TestShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {

		// Shallow Cloning
		System.out.println("-----SHALLOW CLONING-----");
		Test testS = new Test(2);
		Account account = new Account("0011", "Saving", 1000, testS);

		CustomerS customerS = new CustomerS(1, "Sunrays", account);
		CustomerS customer2 = (CustomerS) customerS.clone();

		System.out.println("customerS.account == customer2.account: "
				+ (customerS.getAccount() == customer2.getAccount()));
		System.out
				.println("customerS.account.getTest() == customer2.account.getTest(): "
						+ (customerS.getAccount().getTest() == customer2
								.getAccount().getTest()));
		System.out.println("Customer Id: " + customer2.getCustomerId());
		System.out.println("Customer Name: " + customer2.getName());
		System.out.println("Customer Account Number: "
				+ customer2.getAccount().getNumber());
		System.out.println("Customer Account Type: "
				+ customer2.getAccount().getAccountType());
		System.out.println("Customer Account Balance: "
				+ customer2.getAccount().getBalance());

		// Deep Cloning
		System.out.println();
		System.out.println("-----DEEP CLONING-----");
		Test testD = new Test(3);
		Account accountd = new Account("0022", "Current", 2000, testD);

		CustomerD customerD = new CustomerD(2, "Abhiraj", accountd);
		CustomerD customer3 = (CustomerD) customerD.clone();

		System.out.println("customerD.account == customer3.account: "
				+ (customerD.getAccount() == customer3.getAccount()));
		System.out
				.println("customerD.account.getTest() == customer3.account.getTest(): "
						+ (customerD.getAccount().getTest() == customer3
								.getAccount().getTest()));
		System.out.println("Customer Id: " + customer3.getCustomerId());
		System.out.println("Customer Name: " + customer3.getName());
		System.out.println("Customer Account Number: "
				+ customer3.getAccount().getNumber());
		System.out.println("Customer Account Type: "
				+ customer3.getAccount().getAccountType());
		System.out.println("Customer Account Balance: "
				+ customer3.getAccount().getBalance());
	}
}

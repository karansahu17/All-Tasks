package ncs.task02.primenumber;

public class PrimeNo {

	String name;
	String id;
	int roll_No;

	void getName() {
		System.out.println("Get");
	}

	void getShow() {
		System.out.println("Show");
	}

	public static void main(String[] args) {
		PrimeNo p = new PrimeNo();
		p.getName();
		PrimeNo p2 = new PrimeNo();
		p2.getShow();
	}

}

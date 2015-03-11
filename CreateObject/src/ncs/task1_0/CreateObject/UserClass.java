package ncs.task1_0.CreateObject;

public class UserClass implements Cloneable {

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private String firstName;
	private String lastName;
	private int rollNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}

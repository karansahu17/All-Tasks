package ncs.task5_0.serializeanobject;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName;
	private String lastName;
	private transient String tempValue;

	public Employee(int id, String firstName, String lastName, String tempValue) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tempValue = tempValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getTempValue() {
		return tempValue;
	}

	public void setTempValue(String tempValue) {
		this.tempValue = tempValue;
	}

}

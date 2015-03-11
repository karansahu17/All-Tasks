package ncs.task4_1.CollectionImplementComparableComparator;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String country;

	public Employee(Integer id, String firstName, String lastName,
			String address, String city, String state, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int compareTo(Employee e) {
		return this.id.compareTo(e.id);

	}

	@Override
	public String toString() {
		return "ID:" + id + ", Name:" + firstName + " " + lastName + ", City:"
				+ city +", State:"+state;
	}
}

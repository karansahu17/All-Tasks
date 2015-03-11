package ncs.task2_4.ImmutableClass;

/*Create an Immutable class using following steps 

 (1) Define private final attributes to hold the Class state
 (2) Define parameterized Constructor to initialize final attributes.
 (3) Define getter methods to fetch the attributes.
 (4) Don’t define Setter methods.
 (5) Define Class final so that Child cannot be created and Child cannot change the behavior of Class.*/

public final class ImmutableClass {
	private final String name;
	private final int age;

	public ImmutableClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

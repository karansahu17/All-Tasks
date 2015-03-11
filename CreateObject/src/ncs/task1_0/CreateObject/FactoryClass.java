package ncs.task1_0.CreateObject;

public class FactoryClass {
	private FactoryClass() {
	}

	public static UserClass getObject() {

		return new UserClass();
	}

}

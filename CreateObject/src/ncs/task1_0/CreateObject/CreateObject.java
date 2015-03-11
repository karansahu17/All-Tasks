package ncs.task1_0.CreateObject;

/*1 Create an object without using “new” keyword.
 2.	Create an Object using clone() method. 
 3.	Create an object using a factory class.*/

public class CreateObject {
	public static void main(String[] args) throws Exception {

		// UserClass class1 = new UserClass();

		UserClass class2 = (UserClass) Class.forName(
				"ncs.task1_0.CreateObject.UserClass").newInstance();

		UserClass class3 = (UserClass) class2.clone();

		UserClass class4 = FactoryClass.getObject();

		class2.setFirstName("Class.forName() method");
		System.out.println(class2.getFirstName());

		class3.setFirstName("clone() method");
		System.out.println(class3.getFirstName());

		class4.setFirstName("Factory Class");
		System.out.println(class4.getFirstName());

	}
}

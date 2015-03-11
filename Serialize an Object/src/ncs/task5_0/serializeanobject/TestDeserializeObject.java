/*Create a program to serialize Employee class into a file

1. Create Employee class and implement by Serializable interface?
2. Write a program to persist it into a file?
3. Write a program to read object from persisted file and display at console.*/

package ncs.task5_0.serializeanobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserializeObject {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileInputStream file = new FileInputStream(
				"G:/Java Workspace/4721 Serialize an Object/Employee.txt");
		ObjectInputStream inputStream = new ObjectInputStream(file);
		Employee employee = (Employee) inputStream.readObject();
		System.out.println("Id: " + employee.getId());
		System.out.println("First Name: " + employee.getFirstName());
		System.out.println("Last Name: " + employee.getLastName());
		System.out.println("Transient Value: " + employee.getTempValue());
		inputStream.close();
	}
}

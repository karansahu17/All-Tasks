/*Create a program to serialize Employee class into a file

1. Create Employee class and implement by Serializable interface?
2. Write a program to persist it into a file?
3. Write a program to read object from persisted file and display at console.*/

package ncs.task5_0.serializeanobject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializeObject {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(
				"G:/Java Workspace/4721 Serialize an Object/Employee.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(file);
		Employee obj = new Employee(1, "Sun", "Rays", "2014");
		outputStream.writeObject(obj);
		outputStream.close();
		System.out.println("Serialization Successful...");
	}
}

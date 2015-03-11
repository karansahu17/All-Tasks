/*Make a sample program to execute Native SQL using Hibernate. It will all fetch ID, 
 * Name from Employee table and display.*/

package in.co.test;

import in.co.dto.EmployeeDTO;
import in.co.service.EmployeeService;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

	public static void addEmployee() {
		EmployeeService service = new EmployeeService();
		EmployeeDTO dto = new EmployeeDTO();
		dto.setName("Ramlal");
		dto.setPassword("shamlal1234");

		service.addEmployee(dto);
	}

	public static void getlist() {
		EmployeeService service = new EmployeeService();
		EmployeeDTO dto;
		ArrayList list = (ArrayList) service.listEmplyoyee();

		// for (Object object : list) {
		// dto = (EmployeeDTO) object;
		// System.out.print(dto.getId());
		// System.out.print("  " + dto.getName());
		// System.out.println("  " + dto.getPassword());
		// }

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			EmployeeDTO dto2 = (EmployeeDTO) iterator.next();
			System.out.println(dto2.getId());
			System.out.println(dto2.getName());
		}
	}

	// public static void getlist() {
	// EmployeeService service = new EmployeeService();
	// ArrayList list = (ArrayList) service.listEmplyoyee();
	// Iterator it = list.iterator();
	// while (it.hasNext()) {
	// Object[] object = (Object[]) it.next();
	// System.out.println(object[0]);
	// System.out.println(object[1]);
	// // System.out.println(object[2]);
	// }
	// }

	public static void main(String[] args) {
		// addEmployee();
		getlist();
	}
}

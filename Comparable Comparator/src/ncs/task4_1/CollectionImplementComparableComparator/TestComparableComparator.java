package ncs.task4_1.CollectionImplementComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparableComparator {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Abhiraj", "Chouhan", "Vaibhav Nagar",
				"Indore", "MP", "India"));
		list.add(new Employee(3, "Deepak", "Prajapat", "MP Colony", "Vienna",
				"Vienna", "Austria"));
		list.add(new Employee(2, "Rahul", "Saxena", "Medison", "NY City", "NY",
				"USA"));

		Collections.sort(list);
		Iterator<Employee> it = list.iterator();
		Employee employee = null;
		// System.out.println(list.toString());
		System.out.println("Sort by ID");
		while (it.hasNext()) {
			employee = it.next();
			System.out.println(employee.toString());
		}

		System.out.println();
		Collections.sort(list, new SortEmployeeByFirstName());
		it = list.iterator();
		System.out.println("Sort By First ascending");
		while (it.hasNext()) {
			employee = it.next();
			System.out.println(employee.toString());
		}
//
//		System.out.println();
//		Collections.sort(list, new SortEmployeeByFirstNameDesc());
//		it = list.iterator();
//		System.out.println("Sort By First descending");
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
//
//		System.out.println();
//		System.out.println("Sort by Last Name ascending");
//		Collections.sort(list, new SortEmployeeByLastName());
//		it = list.iterator();
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
//
//		System.out.println();
//		System.out.println("Sort by Last Name descending");
//		Collections.sort(list, new SortEmployeeByLastNameDesc());
//		it = list.iterator();
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
//
//		System.out.println();
//		System.out.println("Sort by City in ascending order");
//		Collections.sort(list, new SortEmployeeByCity());
//		it = list.iterator();
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
//
//		System.out.println();
//		System.out.println("Sort by City in descending order");
//		Collections.sort(list, new SortEmployeeByCityDesc());
//		it = list.iterator();
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
//
//		System.out.println();
//		System.out.println("Sort by Last State ascending");
//		Collections.sort(list, new SortEmployeeByState());
//		it = list.iterator();
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
//
//		System.out.println();
//		System.out.println("Sort by Last State descending");
//		Collections.sort(list, new SortEmployeeByStateDesc());
//		it = list.iterator();
//		while (it.hasNext()) {
//			employee = it.next();
//			System.out.println(employee.toString());
//		}
	}
}

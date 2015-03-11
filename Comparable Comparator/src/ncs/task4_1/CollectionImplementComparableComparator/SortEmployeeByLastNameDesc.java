package ncs.task4_1.CollectionImplementComparableComparator;

import java.util.Comparator;

public class SortEmployeeByLastNameDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getLastName().compareTo(o1.getLastName());
	}

}

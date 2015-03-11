package ncs.task4_1.CollectionImplementComparableComparator;

import java.util.Comparator;

public class SortEmployeeByLastName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getLastName().compareTo(e2.getLastName());
	}

}

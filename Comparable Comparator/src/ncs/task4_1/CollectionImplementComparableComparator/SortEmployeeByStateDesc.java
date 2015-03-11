package ncs.task4_1.CollectionImplementComparableComparator;

import java.util.Comparator;

public class SortEmployeeByStateDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getState().compareTo(o1.getState());
	}

}

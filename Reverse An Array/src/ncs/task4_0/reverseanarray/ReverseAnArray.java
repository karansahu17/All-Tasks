/*Reverse the following ArrayList
 ArrayList arrayList = new ArrayList();

 //Add elements to Arraylist
 arrayList.add("A");
 arrayList.add("B");
 arrayList.add("C");
 arrayList.add("D");
 arrayList.add("E");*/

package ncs.task4_0.reverseanarray;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		System.out.println(list.toString());

		Collections.reverse(list);

		System.out.println(list.toString());

		for (int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}

		System.out.println(list.toString());
	}

}
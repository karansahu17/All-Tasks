package ncs.task1_2.stringvsstringbuffer;

/*1.	Write a program to demonstrate StringBuffer .
 2.	Write a program to demonstrate StringBuilder.

 Exercise 
 1.	Difference between String and StringBuffer ?
 2.	Difference between StringBuffer and StringBuilder?*/

public class StringClasses {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Vijay"); // Buffer is intialized by
														// string "Vijay"
		sb1.append(" Dinanath"); // Now append string " Dinanath" in string
									// buffer
		sb1.append(" Chouhan"); // Now append string " Chouhan" in string buffer

		String name1 = sb1.toString(); // Convert StringBuffer into String
										// object;
		System.out.println(sb1 + " " + name1);

		StringBuilder sb2 = new StringBuilder("Vijay"); // Builder is intialized
														// by string "Vijay"
		sb2.append(" Dinanath"); // Now append string " Dinanath" in string
									// builder
		sb2.append(" Chouhan"); // Now append string " Chouhan" in string
								// builder

		String name2 = sb2.toString(); // Convert StringBuilder into String
										// object;
		System.out.println(sb2 + " " + name2);

	}
}

package assignment.maxnumber;

import java.util.Scanner;

public class MaxNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean b;

		do {
			System.out.println("Enter two numbers");
			double i = sc.nextDouble();
			double j = sc.nextDouble();

			if (i < j) {
				System.out.println("First is Minimum");
			} else if (j < i) {
				System.out.println("Second is Minimum");
			} else if (i == j) {
				System.out.println("Both are equal");
			} else {
				System.out.println("Error...");
			}
			System.out.println("To continue type true");
			b = sc.nextBoolean();
		} while (b);
		sc.close();
	}
}

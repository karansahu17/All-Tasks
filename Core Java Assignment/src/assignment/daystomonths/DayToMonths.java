package assignment.daystomonths;

import java.util.Scanner;

public class DayToMonths {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of days to convert");
		int iDays = sc.nextInt();

		int months = iDays / 30;
		int days = iDays % 30;

		System.out.println(iDays + " days = " + months + " Months and " + days
				+ " days");

		sc.close();
	}
}

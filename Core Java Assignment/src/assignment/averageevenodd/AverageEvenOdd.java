/*21. Write a program to find average of consecutive N Odd no. and Even no. */

package assignment.averageevenodd;

import java.util.Scanner;

public class AverageEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumEven = 0, countEven = 0;
		int sumOdd = 0, countOdd = 0;
		System.out.println("Enter number for addition");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				countEven++;
				sumEven += i;
			} else {
				countOdd++;
				sumOdd += i;
			}
		}
		System.out.println("Even sum: " + sumEven + " Count: " + countEven);
		System.out.println("Odd sum: " + sumOdd + " Count: " + countOdd);
		System.out.println("Even Average: " + sumEven / countEven);
		System.out.println("Odd Average: " + sumOdd / countOdd);
		sc.close();
	}
}
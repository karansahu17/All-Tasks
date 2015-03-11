/* 20. Write a program to generate Harmonic Series.
Example :
Input - 5
Output - 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28 (Approximately) */

package assignment.harmonic;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check");
		int num = sc.nextInt();
		double sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i == 1)
				System.out.print(i);
			else
				System.out.print(" + 1/" + i);
			sum += (double) 1 / i;
		}

		System.out.println(" = " + sum);

		sc.close();
	}
}

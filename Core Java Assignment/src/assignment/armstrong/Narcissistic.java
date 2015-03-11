/*16. Write a program to find whether given no. is Armstrong or not.*/

package assignment.armstrong;

import java.util.Scanner;

public class Narcissistic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check");
		int num = sc.nextInt();
		int temp = num, sum = 0;
		do {
			int rem;
			rem = temp % 10;
			temp = temp / 10;
			sum += rem * rem * rem;
		} while (temp != 0);

		if (num == sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not an Armstrong");
		sc.close();
	}
}

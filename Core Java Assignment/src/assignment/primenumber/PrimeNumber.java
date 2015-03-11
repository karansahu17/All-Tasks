/*17. Write a program to Find whether number is Prime or Not.*/

package assignment.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check");
		int i;
		int num = sc.nextInt();

		for (i = 2; i < num; i++) {
			int temp = num % i;
			if (temp == 0) {
				
				
				System.out.println("Number is not Prime");
				break;
			}
		}

		if (i == num)
			System.out.println("Number is Prime");
		sc.close();
	}
}

package ncs.task02.primenumber;

import java.util.Scanner;

/*Create a program to generate Prime Number with least number of lines*/

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc;
		String flag;
		do {
			search: {
				sc = new Scanner(System.in);
				System.out.print("Enter number to check: ");
				int num = sc.nextInt();
				int i;
				if (num == 1) {
					System.out.println("Number is not Prime");
					break search;
				}
				for (i = 2; i < num; i++) {
					if (num % i == 0) {
						System.out.println("Number is not Prime");
						break;
					}
				}

				if (i == num) {
					System.out.println("Number is Prime");
				}

			}
			System.out.print("\nEnter y to check more: ");
			flag = sc.next();
		} while (flag.equalsIgnoreCase("y"));
	}
}

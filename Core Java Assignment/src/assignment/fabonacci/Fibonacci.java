package assignment.fabonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num for Febonacci");
		int num = sc.nextInt();
		int pre = 0;
		int next = 1;
		int sum = 0;

		for (int i = 0; i < num; i++) {
			sum = pre + next;
			System.out.print(pre + " ");
			pre = next;
			next = sum;
		}
		sc.close();
	}

}

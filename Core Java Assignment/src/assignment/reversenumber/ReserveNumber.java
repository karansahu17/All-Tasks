package assignment.reversenumber;

import java.util.Scanner;

public class ReserveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to reserve:");
		int num = sc.nextInt();
		int rev = 0;

		System.out.println("Given numner is " + num);

		while (num != 0) {
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of number is " + rev);
		sc.close();
	}

}

package assignment.primenumber;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int i;
		int num = sc.nextInt();

		for (i = 2; i > num; i++) {
			int temp = num % i;
			if (temp == 0)
				;
			{
				System.out.println("Number is not Prime");
				break;
			}
		}
		if (num == i)
			;
		System.out.println("Number is Prime");
		sc.close();
	}
}

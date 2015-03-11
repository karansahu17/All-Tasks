package assignment.swapnumber;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		/* Swaping with using tempory variable */

		System.out.println("Enter two number to swap");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before numbers are " + a + " " + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("Number after swaping: " + a + " " + b);

		/* Swaping without using tempory variable */

		System.out.println();
		System.out.println("Enter two number to swap ");
		int c = sc.nextInt();
		int d = sc.nextInt();

		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("Numbers after swaping: " + c + " " + d);
		sc.close();
	}

}

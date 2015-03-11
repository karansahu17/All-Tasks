package ncs.task03.swapnumber;

import java.util.Scanner;

/*Write a program to Swap two numbers without using third variable*/

public class SwapNumbers {
	public static void main(String[] args) {
		System.out.println("Enter two number to swap");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before numbers are: " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Number after swapping: " + a + " " + b);

		sc.close();
	}
}

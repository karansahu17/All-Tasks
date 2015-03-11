/*18. Write a program to find whether no. is palindrome or not.*/

package assignment.palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check");
		int sum = 0;
		int num = sc.nextInt();
		int temp = num;

		while (temp != 0) {
			sum = sum * 10 + temp % 10;
			temp = temp / 10;
		}

		if (sum == num) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
		sc.close();
	}
}

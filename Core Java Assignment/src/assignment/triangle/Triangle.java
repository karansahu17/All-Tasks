/*14. Write a program to generate a Triangle.
eg:
1
2 2
3 3 3
4 4 4 4
and so on as per user given number.*/

package assignment.triangle;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of triangle");
		int size = sc.nextInt();

		for (int i = 1; i < size + 1; i++) {
			System.out.println();

			for (int j = 1; j < i + 1; j++) {
				System.out.print(i + " ");

			}
		}
		sc.close();
	}
}

/*15. Write a program to Display Invert Triangle.
      Example:
      Input - 5
      Output :
      5 5 5 5 5
      4 4 4 4
      3 3 3
      2 2
      1               */

package assignment.inverttriangle;

import java.util.Scanner;

public class InvertTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of triangle");
		int size = sc.nextInt();

		for (int i = size; i > 0; i--) {
			System.out.println();
			for (int j = i; j > 0; j--) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}

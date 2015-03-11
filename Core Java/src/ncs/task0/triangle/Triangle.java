package ncs.task0.triangle;

/*2.   Write a program to generate a Triangle for a given number.
 eg:
 1
 2 2
 3 3 3
 4 4 4 4*/
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size to print triangle");
		int size = sc.nextInt();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

/*19. switch case demo
Example :
Input - 124
Output - One Two Four */

package assignment.switchcase;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to print in words");
		int i = 0;
		int temp[] = new int[10];
		int num = sc.nextInt();

		do {
			temp[i] = num % 10;
			num = num / 10;
			i++;
		} while (num > 0);
		for (int j = i - 1; j >= 0; j--)
			switch (temp[j]) {
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			case 0:
				System.out.print("Zero ");
				break;
			default:
				System.out.println("Enter only numbers");
				break;
			}
		sc.close();
	}
}

/*23. Write a function that take an integer array as an input and finds the largest number in the
Array?*/

package assignment.largestnumber;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int mArray[] = new int[size];
		System.out.println("Enter array elements to find largest number");
		for (int i = 0; i < mArray.length; i++) {
			mArray[i] = sc.nextInt();
		}

		System.out.println("Largest Number is "+ largestNumber(mArray));
		sc.close();
	}

	private static int largestNumber(int[] iArray) {
		int larg = iArray[0];
		for (int i = 0; i < iArray.length; i++) {
			if (iArray[i]>larg) {
				larg = iArray[i];
			}
		}
		return larg;
	}
	
}

/*22. Reverse an array
 This version of reverse uses two subscripts: one that starts at the left (beginning)
 of the array, and one that starts at the right (end) of the array. You can also use a
 for loop that goes to the middle of the array.*/

package assignment.reverse;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int mArray[] = new int[size];
		System.out.println("Enter array elements to reverse");
		for (int i = 0; i < mArray.length; i++) {
			mArray[i] = sc.nextInt();
		}


		for (int left = 0, right = mArray.length-1 ; left < right ; left++, right--) {

			int temp = mArray[left];
			mArray[left] = mArray[right];
			mArray[right] = temp;
		}
		System.out.println("Array elements after reversal: ");
		for (int i = 0; i < mArray.length; i++) {
			System.out.println(mArray[i]);;
		}
		sc.close();
	}
}

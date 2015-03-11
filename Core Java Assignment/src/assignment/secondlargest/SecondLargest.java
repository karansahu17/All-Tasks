/*24. Write a function on that takes an integer array as an input and finds the second largest
number in the array?(using single loop, with out sorting array).*/

package assignment.secondlargest;

import java.util.Scanner;

public class SecondLargest {
	int largest = 0;
	int secondLargest = 0;

	int secondLarge(int[] iArray){
		for (int i = 0; i < iArray.length; i++) {
			if (largest<iArray[i]) {
				secondLargest = largest;
				largest = iArray[i];
			}
			else if (secondLargest<iArray[i]) {
				secondLargest = iArray[i];
			}
		}
		System.out.println("Largest Number is "+ largest);
		return secondLargest;
	}


	public static void main(String[] args) {
		SecondLargest sl = new SecondLargest();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int mArray[] = new int[size];

		System.out.println("Enter array elements to find largest number");

		for (int i = 0; i < mArray.length; i++) {
			mArray[i] = sc.nextInt();
		}

		int secondlarge = sl.secondLarge(mArray);
		System.out.println("Second largest Number is "+secondlarge);
		sc.close();
	}
}

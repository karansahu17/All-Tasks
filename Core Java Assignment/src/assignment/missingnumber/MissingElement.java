package assignment.missingnumber;

/*26. Given two integer array A and B has n element and B has n-1 element. A has all the
 element that are in B, but B has one missing element. Write a function that takes arrays A
 and B as input and finds the missing element in the most optimized manner.*/

public class MissingElement {
	int findMisingNumber(int[] aArray, int[] bArray) {
		int sumA = 0, sumB = 0;
		for (int i = 0; i < aArray.length; i++) {
			sumA += aArray[i];
		}
		for (int i = 0; i < bArray.length; i++)

		{
			sumB += bArray[i];
		}
		return sumA - sumB;
	}

	public static void main(String[] args) {
		int aArray[] = { 2, 3, 4, 5, 6, 7, 8, 9, 1, 0 };
		int bArray[] = { 2, 3, 4, 5, 7, 8, 9, 1, 0 };

		MissingElement ele = new MissingElement();

		int missElement = ele.findMisingNumber(aArray, bArray);
		System.out.println("Missing Number is " + missElement);
	}
}

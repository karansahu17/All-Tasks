package ncs.task0.missingelement;

/*5.There are two integer arrays, A that has N elements and array B that has N-1 elements. 
A has all the elements that are in B except one. Write a function to find out missing element from array A.*/

public class MissingElement {

	int findMisingNumber(int[] aArray, int[] bArray){
		int sumA = 0, sumB = 0;
		for (int i = 0; i < aArray.length; i++) {
			sumA += aArray[i];
		}
		for (int i = 0; i < bArray.length; i++) {
			sumB += bArray[i];
		}
		return sumA-sumB;
	}

	public static void main(String[] args) {
		int aArray[] = {2,3,4,5,6,7,8,9,1,0};
		int bArray[] = {2,3,4,5,7,8,9,1,0};

		MissingElement ele = new MissingElement();

		int missElement = ele.findMisingNumber(aArray,bArray);
		System.out.println("Missing Number is "+ missElement);
	}
}

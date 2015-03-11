package ncs.task0.reversearray;
/*3.Reverse 10 elements integer array.*/

public class ReverseArray {
	public static void main(String[] args) {
		int aAr[] = {1,3,5,7,9,2,4,6,8,0};
		int size = aAr.length;
		
		for (int i = 0,j = size-1; i < j; i++,j--) { //This important THREE lines
			int temp = aAr	[i];
			aAr[i] = aAr[j];
			aAr[j] = temp;

		}
		for (int i = 0; i < aAr.length; i++) {
			System.out.print(aAr[i]+", ");
		}
	}
}

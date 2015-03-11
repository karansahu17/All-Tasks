package ncs.task0.secondlargest;

import java.util.Scanner;

/*4.   Write a function that takes an integer array as an input and finds the 
       second largest number in the Array?*/
public class SecondLargest {

	int secondLargest(int[] array){
		int large = 0, secLarge = 0;
		for (int i = 0; i < array.length; i++) {
			if (large<array[i]) {
				secLarge = large;
				large = array[i];
			}
			else if (secLarge<array[i]) {
				secLarge = array[i];
			}
		}
		return secLarge;
	}

	public static void main(String[] args) {
		SecondLargest sl = new SecondLargest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int ary[] = new int[size];

		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			ary[i] = sc.nextInt();
		}

		System.out.println("Second Largest number is "+ sl.secondLargest(ary));
	}
}

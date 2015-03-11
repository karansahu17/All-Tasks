package ncs.task0_1.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

/*Make a program to sort 20 elements integer array using Bubble sort.*/

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int ary[] = new int[20];
		System.out.println("Enter 20 Elements");
		for (int i = 0; i < 20; i++)
			ary[i] = sc.nextInt();

		for (int j = 0; j < ary.length - 1; j++)
			for (int i = 0; i < ary.length - 1; i++)
				if (ary[i] > ary[i + 1]) {
					int temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}

		System.out.println("Sorted array: " + Arrays.toString(ary));
	}
}

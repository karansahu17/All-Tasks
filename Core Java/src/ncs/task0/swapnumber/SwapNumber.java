package ncs.task0.swapnumber;
/*1.   Write a program to Swap the values, with and without using temporary variable.*/

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		System.out.println("Enter two number to swap");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		/*With using third variable*/
		System.out.println("Before numbers are a:"+a +"b: "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Number after swapping with variable a="+a+",b="+b);

		System.out.println("");
		/*Without using third variable*/
		System.out.println("Before numbers are "+a +" "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Number after swapping w/o third	 variable "+a+" "+b);
		sc.close();
	}
}
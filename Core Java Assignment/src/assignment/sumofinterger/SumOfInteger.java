package assignment.sumofinterger;

public class SumOfInteger {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 100 ; i <=200 ; i++) {
			if (i%7==0)
				sum = sum+i;
		}

		System.out.println("Sum of numbers is "+sum);
	}

}

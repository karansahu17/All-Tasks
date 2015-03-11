package assignment.factorial;

public class Factorial {

	public static void main(String[] args) {

		int a = 7;
		double fact = 1;
		for (int i = 1; i < a+1; i++) {

			fact = fact*i;
		}
		System.out.println(fact);
	}

}

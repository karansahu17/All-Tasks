package assignment.randomnumber;

public class RandomNumber {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {


			int r = (int)(100*Math.random());

			System.out.println(r);
		}
	}
}

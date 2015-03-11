/*1. Write a program that contains a try block inside finally block.
  2. Write a program that will exit without executing finally block*/

package ncs.task3_0.tryblockinsidefinallyblock;

public class TryBlockInsideFinallyBlock {
	public static void main(String[] args) throws Exception {
		int a = 10;
		int b = 0, c;

		try {
			c = a + b;
			System.out.println("addition is " + c);
			//System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				c = a / b;
				System.out.println("division  is " + c);

			} catch (Exception e) {
				System.out.println("Divide by Zero");
				e.printStackTrace();
			}
		}
	}
}

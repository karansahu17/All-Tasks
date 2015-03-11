package ncs.task2_3.abstractclass;

/*1.Create an abstract class that has abstract methods 
 * 
 2.Create an abstract class that do not have abstract methods 
 3.Make a private method abstract. 
 4.Make a static method abstract.*/

public abstract class TestAbstract {
	public void display() {
		System.out.println("This is not abstract method");
	}

	private void display1() {
	} // private methods can't be accessed in subclass so
								// can't override

	public static void display2() {
	} // static methods are called by Class
									// name,it's rule voilation. it only hides
									// its
									// parents method,It belongs to this class
									// only

}

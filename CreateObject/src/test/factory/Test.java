package test.factory;

public class Test {
	public static void main(String[] args) {
		FactoryClass shapeFactory = new FactoryClass();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Circle
		shape1.area();

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Rectangle
		shape2.area();

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("TRIANGLE");

		// call draw method of circle
		shape3.area();
	}
}

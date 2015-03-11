package ncs.task2_1.inheritance;

/*Create class as per attached class diagram. Make a test program to 
 1.Instantiate Circle class, set its attributes with setter methods and find out area
 2.Instantiate Rectangle class, set its attributes with setter methods and find out area
 3.Instantiate Triangle Class, set its attributes with setter methods and find out area
 4.Create an array of Shapes of three elements that contains Circle, Rectangle , and Triangle. 
 Create a method caculateArea() and pass this array as parameter to this method. caculateArea() will calculate 
 total area of all shapes and return total area.

 Exercise 
 1.How do you achieve inheritance ?
 a.How do you do Dynamic polymorphism? 
 b.How do you do Static polymorphism?	
 2.What is method overriding? 
 3.Which is generalized class?
 4.Which are specialized classes?
 5.When do you create child classes?
 6.Why Shape is an abstract class?
 7.How do you achieve polymorphism?*/
public class InheritanceImplementation {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(4);
		System.out.println(circle.area());

		Rectangle rectangle = new Rectangle();
		rectangle.setBridth(4);
		rectangle.setLength(5);
		System.out.println(rectangle.area());

		Triangle triangle = new Triangle();
		triangle.setBase(6);
		triangle.setHeight(5);
		System.out.println(triangle.area());

		Shape[] shapes = { circle, rectangle, triangle};
		System.out.println(calcuateArea(shapes));

	}

	public static double calcuateArea(Shape[] shape) {
		return shape[0].area() + shape[1].area() + shape[2].area();
	}
}

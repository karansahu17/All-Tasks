package test.factory;

public class FactoryClass {
public Shape getShape(String shapeType) {
	if (shapeType==null) {
		return null;
	}
	else if (shapeType.equalsIgnoreCase("circle")) {
		return new Circle();
	}
	else if (shapeType.equalsIgnoreCase("triangle")) {
		return new Triangle();
	}
	else if (shapeType.equalsIgnoreCase("rectangle")) {
		return new Rectangle();
	}
	return null;
	
}
}

package ncs.task2_1.inheritance;

public abstract class Shape {
	String color;
	int borderWidth;
	int circumference;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getCircumference() {
		return circumference;
	}

	public void setCircumference(int circumference) {
		this.circumference = circumference;
	}

	public abstract double area();
}

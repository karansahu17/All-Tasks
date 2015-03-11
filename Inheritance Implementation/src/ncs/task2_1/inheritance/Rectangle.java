package ncs.task2_1.inheritance;

public class Rectangle extends Shape {
	private int length;
	private int bridth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBridth() {
		return bridth;
	}

	public void setBridth(int bridth) {
		this.bridth = bridth;
	}

	@Override
	public double area() {
		return length*bridth;
	}

}

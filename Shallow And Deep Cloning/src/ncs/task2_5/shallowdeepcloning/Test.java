package ncs.task2_5.shallowdeepcloning;

public class Test implements Cloneable {
	private int i;

	public Test(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

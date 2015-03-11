package ncs.task1_5.callgarbagecollector;

public class ParentClass {
	public void DisplayMode() {
		System.out.println("In Parent Class");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Parent class is elligible for gc");
	}
}

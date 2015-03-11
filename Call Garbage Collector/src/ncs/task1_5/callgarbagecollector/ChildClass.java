package ncs.task1_5.callgarbagecollector;


public class ChildClass extends ParentClass {

	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Child class is elligible for gc");
	}

	@Override
	public void DisplayMode() {
		System.out.println("From Child");
	}
}

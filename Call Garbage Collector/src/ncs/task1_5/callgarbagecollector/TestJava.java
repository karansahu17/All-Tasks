package ncs.task1_5.callgarbagecollector;

public class TestJava {
	int i = 4;

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Test class is elligible for gc");
	}

	public static void main(String[] args) {
		TestJava java = new TestJava();
		java.i = 6;
		ChildClass class1 = new ChildClass();
		class1.DisplayMode();
		class1 = null;
		java = null;
		System.gc(); // gc() is static method //public static void gc()
		// Runtime.getRuntime().gc(); // gc() is instance method //public void
		// gc()
	}
}

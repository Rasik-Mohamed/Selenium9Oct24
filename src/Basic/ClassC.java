package Basic;

public class ClassC extends ClassD {
	int a;

	public ClassC(int a) {
		super(a);
		this.a = a;

	}

	public int increment() {

		a = a + 1;
		return a;
	}

	public int decrement() {

		a = a - 1;
		return a;
	}
}

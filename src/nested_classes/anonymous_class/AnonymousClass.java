package nested_classes.anonymous_class;

public class AnonymousClass {
	private int x = 5;
	public static void main(String[] args) {
		Math2 math = new Math2() {
			@Override
			public int doOperation(int a, int b) {
				AnonymousClass anon = new AnonymousClass();
				return a + b + anon.x;
			}
		};
			
		System.out.println(math.doOperation(3, 6));
	}
}

@FunctionalInterface
interface Math2 {
	int doOperation(int a, int b);
}

package enums;

public class Test1 {
	
	private static final int MONDAY = 1;
	
	void method(int dayOfWeek) {
		System.out.println("Today is " + dayOfWeek);
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.method(MONDAY);
	}
}

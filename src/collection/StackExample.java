package collection;

public class StackExample {
	
	static void abc1() {
		System.out.println("abc1-method starts");
		System.out.println("abc1-method ends");
	}
	
	static void abc2() {
		System.out.println("abc2-method starts");
		abc1();
		System.out.println("abc2-method ends");
	}
	
	static void abc3() {
		System.out.println("abc3-method starts");
		abc2();
		System.out.println("abc3-method ends");
	}
	
	public static void main(String[] args) {
		System.out.println("main-method starts");
		abc3();
		System.out.println("main-method ends");
	}
}

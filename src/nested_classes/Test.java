package nested_classes;

public class Test {
	
//static nested class
	static class A {}

//inner class
	class B {}
	
//local inner class
	void method() {
		class C {}
	}
}

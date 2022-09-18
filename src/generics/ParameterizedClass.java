package generics;

public class ParameterizedClass {

	public static void main(String[] args) {
//		Info<Integer> info1 = new Info(1);
//		System.out.println(info1);
//		
//		Info<Double> info2 = new Info(3.19);
//		System.out.println(info2);
		
		Info<Train> info3 = new Info(new Train());
		System.out.println(info3);
	}
/*
 * После type erasure методы имеют одинаковую сигнатуру
 */
	
//	public void abc(Info<String> info) {
//		String s = info.getValue();
//	}
//	
//	public void abc(Info<Integer> info) {
//		Integer i = info.getValue();
//	}
}

class Info<T extends Number & I1 & I2> {
	private T value;

	public Info(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	public String toString() {
		return "[{" + value + "}]";
	}
}

interface I1 {}

interface I2 {}

class Train extends Number implements I1, I2 {

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

//class Parent {
//	
//	public void abc(Info<String> info) {
//		String s = info.getValue();
//	}
//}

//class ChildParent extends Parent {
//	/*
//	 * При переопределении таким образом возникнет ошибка
//	 */
//	@Override
//	public void abc(Info<Integer> info) {
//		Integer i = info.getValue();
//	}
//}

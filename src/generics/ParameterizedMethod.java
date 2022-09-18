package generics;

import java.util.List;

public class ParameterizedMethod {
	public static void main(String[] args) {
		GenMethod method = new GenMethod("Russia");
		System.out.println(method.getValue());
	}
}

class GenMethod <T>{
	
	private T value;
	
	GenMethod(T value) {
		this.value = value;
	}
	
	public <T> T getValue() {
		return (T) value;
	}
}

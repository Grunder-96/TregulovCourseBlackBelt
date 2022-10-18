package stream;

import java.util.Arrays;

public class Test3 {
	
	public static void main(String[] args) {
		
		int[] array = {2, 6, 76, 4, 5435, 554, -2, -4543, 0};
		Arrays.stream(array)
			.forEach(Utils::myMethod);
	}
}

class Utils {
	
	public static void myMethod(int a) {
		
		a += 5;
		System.out.println(a);
	}
}

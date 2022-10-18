package stream;

import java.util.Arrays;

public class Test5 {
	
	public static void main(String[] args) {
		
		int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 19};
//		System.out.println(Arrays.toString(array));
//		
//		array = Arrays.stream(array)
//			.sorted()
//			.toArray();
//		System.out.println(Arrays.toString(array));
		
		int answer = Arrays.stream(array)
			.filter(a -> a % 2 != 0)
			.map(b -> b % 3 == 0 ? b / 3 : b)
			.reduce((ac, val) -> ac + val)
			.getAsInt();
		System.out.println(answer);
	}
}

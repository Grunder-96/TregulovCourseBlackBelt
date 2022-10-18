package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test6 {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
		Object[] array = stream.filter(el -> {
			System.out.println("!!!");
			return el % 2 == 0;
		}).toArray();
		
		System.out.println(Arrays.toString(array));
		
		for (Object i : array) {
			System.out.println(i.getClass()); 
		}
	}
}

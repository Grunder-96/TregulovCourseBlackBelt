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
		
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> stream2 = Stream.of(5, 7, 8, 9, 10);
		Stream<Integer> stream3 = Stream.concat(stream1, stream2);
		
		stream3.forEach((val) -> System.out.print(val));
		System.out.println();
		
		Stream<Integer> stream5 = Stream.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5).distinct();
		//stream5.forEach(System.out::println);
		//System.out.println(stream5.count());
		System.out.println(stream5.peek(System.out::println).count());
	}
}

package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("privet", "kak dela?", "poka");
//		for (String s : list) {
//			System.out.println(s);
//		}
//		System.out.println();
//		list.forEach(s -> System.out.println(s));
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		list2.forEach(a -> {
			System.out.println(a);
			a *= 2;
			System.out.println(a);
		});
		
	}
}

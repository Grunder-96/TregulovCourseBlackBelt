package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(3);
		
		int result = list.stream()
			.reduce((accumulator, element) -> accumulator + element)
			.get();
		
		System.out.println(result);
		
		int result2 = list.stream()
				.reduce(1, (accumulator, element) -> accumulator + element);
			
			System.out.println(result2);
			
			List<String> list3 = new ArrayList<>();
			list3.add("Russia");
			list3.add("USA");
			list3.add("Canada");
			list3.add("China");
			
			String string3 = list3.stream()
					.reduce((s1, s2) -> s1 + " " + s2)
					.get();
			System.out.println(string3);
		
//		List<Integer> list100 = new ArrayList<>();
//		Optional<Integer> optional = list100.stream()
//				.reduce((accumulator, element) -> accumulator + element);
//		if (optional.isPresent()) {
//			System.out.println(optional.get());
//		} else {
//			System.out.println("Возникла ошибка");
//		}
	}
}

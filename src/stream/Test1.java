package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Russia");
		list.add("USA");
		list.add("Canada");
		list.add("China");
		
//		for (int i = 0; i < list.size(); i++) {
//			list.set(i, String.valueOf(list.get(i).length()));
//		}
		
		List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(list2);
		
		int[] array = {1, 10, 15, 65, 3, -321, 23, 68};
		int[] array2 = Arrays.stream(array).map(a -> a + 10).toArray();
		
		System.out.println(Arrays.toString(array2));
		
		Set<String> set = new TreeSet<>();
		set.add("Russia");
		set.add("USA");
		set.add("Canada");
		set.add("China");
		
		System.out.println(set);
		
		Set<Integer> set2 = set.stream().map(i -> i.length()).collect(Collectors.toSet());
		System.out.println(set2);
	}
}

package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(null);
		arrayList.add("Russia");
		arrayList.add("USA");
		arrayList.add("Hungary");
		arrayList.add(null);
		System.out.println(arrayList);
		
		List<String> arrayList2 = new ArrayList<>(30);
		arrayList.add("Zaur");
		arrayList.add("Ivan");
		
		List<String> arrayList3 = new ArrayList<>(arrayList2);
		
		System.out.println(arrayList2 == arrayList3);
	}
	
}

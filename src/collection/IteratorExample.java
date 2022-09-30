package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Russia");
		arrayList.add("USA");
		arrayList.add("Hungary");
		arrayList.add("Germany");
		arrayList.add("Italy");
		
//ConcurrentModificationException
//		for (String country : arrayList) {
//			arrayList.remove(country);
//		}
//		System.out.println(arrayList);
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
			iterator.next();
			iterator.remove();
		}
		System.out.println(arrayList);
	}
}

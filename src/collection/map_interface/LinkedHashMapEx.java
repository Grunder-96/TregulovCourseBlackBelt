package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Double, Student> lhmap = new LinkedHashMap<>(16, 0.75f, true);
		
		Student st1 = new Student("Zaur", "Tregulov", 3);
		Student st2 = new Student("Mariya", "Ivanova", 1);
		Student st3 = new Student("Sergey", "Petrov", 4);
		Student st4 = new Student("Igor", "Sidorov", 2);
		
		lhmap.put(3.8, st1);
		lhmap.put(6.4, st2);
		lhmap.put(7.2, st3);
		lhmap.put(7.5, st4);

		System.out.println(lhmap);
		
		System.out.println(lhmap.get(6.4));
		System.out.println(lhmap.get(7.2));
		
		System.out.println(lhmap);
	}
}

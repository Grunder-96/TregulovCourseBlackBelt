package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		TreeMap<Double, Student> treemap = new TreeMap<>();
//		TreeMap<Student, Double> treemap2 = new TreeMap<>((a, b) -> a.surname.compareTo(b.surname));
		
		Student st1 = new Student("Zaur", "Tregulov", 3);
		Student st2 = new Student("Mariya", "Ivanova", 1);
		Student st3 = new Student("Sergey", "Petrov", 4);
		Student st4 = new Student("Igor", "Sidorov", 2);
		Student st5 = new Student("Vasiliy", "Smirnov", 1);
		Student st6 = new Student("Sasha", "Rasputin", 3);
		Student st7 = new Student("Elena", "Sidorova", 4);
		
		treemap.put(3.8, st1);
		treemap.put(6.4, st2);
		treemap.put(7.2, st3);
		treemap.put(7.5, st4);
		treemap.put(7.9, st5);
		treemap.put(8.2, st6);
		treemap.put(9.1, st7);
		treemap.put(null, st7);
		
//		treemap2.put(st1, 3.8);
//		treemap2.put(st7, 9.1);
//		treemap2.put(st2, 6.4);
//		treemap2.put(st4, 7.5);
//		treemap2.put(st3, 7.2);
//		treemap2.put(st6, 8.2);
//		treemap2.put(st5, 7.9);
//		
//		System.out.println(treemap2);
//		System.out.println();
		
		System.out.println(treemap);
		System.out.println(treemap.descendingMap());
		System.out.println(treemap.tailMap(6.4));
		System.out.println(treemap.headMap(6.4));
		System.out.println(treemap.lastEntry());
		System.out.println(treemap.firstEntry());
		
//		Student st8 = new Student("Elena", "Sidorova", 4);
//		System.out.println(treemap.containsKey(st8));
		
	}
}

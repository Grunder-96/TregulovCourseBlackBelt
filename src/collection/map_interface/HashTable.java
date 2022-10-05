package collection.map_interface;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		
		Hashtable<Double, Student> hashtable = new Hashtable<>(); 
		
		Student st1 = new Student("Zaur", "Tregulov", 3);
		Student st2 = new Student("Mariya", "Ivanova", 1);
		Student st3 = new Student("Sergey", "Petrov", 4);
		Student st4 = new Student("Igor", "Sidorov", 2);
		
		hashtable.put(3.8, st1);
		hashtable.put(6.4, st2);
		hashtable.put(7.2, st3);
		hashtable.put(7.5, st4);
		
		System.out.println(hashtable);
	}
}

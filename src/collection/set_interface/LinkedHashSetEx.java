package collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lHSet = new LinkedHashSet<>();
		
		lHSet.add(5);
		lHSet.add(3);
		lHSet.add(1);
		lHSet.add(8);
		lHSet.add(10);
		
		lHSet.remove(8);
		
		System.out.println(lHSet.contains(8));
		
		System.out.println(lHSet);
	}
}

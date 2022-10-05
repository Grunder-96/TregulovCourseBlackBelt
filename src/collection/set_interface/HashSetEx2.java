package collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashset1 = new HashSet<>();
		
		hashset1.add(5);
		hashset1.add(8);
		hashset1.add(1);
		hashset1.add(3);
		hashset1.add(2);
		
		HashSet<Integer> hashset2 = new HashSet<>();
		
		hashset2.add(5);
		hashset2.add(7);
		hashset2.add(4);
		hashset2.add(3);
		hashset2.add(8);
		
		HashSet<Integer> union = new HashSet<>(hashset1);
		union.addAll(hashset2);
		System.out.println(union);
		
		HashSet<Integer> intersect = new HashSet<>(hashset1);
		intersect.retainAll(hashset2);
		System.out.println(intersect);
		
		HashSet<Integer> subtract = new HashSet<>(hashset1);
		subtract.removeAll(hashset2);
		System.out.println(subtract);
	}
}

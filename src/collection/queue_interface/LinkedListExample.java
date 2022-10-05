package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Zaur");
		queue.add("Oleg");
		queue.add("Ivan");
		queue.add("Mariya");
		queue.add("Aleksandr");
		
		System.out.println(queue);
		System.out.println(queue.remove());
		queue.remove("Ivan");
		System.out.println(queue);
	}
}	

package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeEx {
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.addFirst(3);
		deque.addFirst(5);
		deque.addLast(7);
		deque.offerFirst(1);
		deque.offerLast(8);
		System.out.println(deque);
		System.out.println("Before delete first & last : " + deque.getFirst() + " - " + deque.getLast());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		System.out.println("After delete first & last : " + deque.getFirst() + " - " + deque.getLast());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		
		System.out.println(deque);
	}
}

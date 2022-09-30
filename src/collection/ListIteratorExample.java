package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		
		String s = "madam";
		List<Character> list = new LinkedList<>();
		for (char symbol : s.toCharArray()) {
			list.add(symbol);
		}
		
		ListIterator<Character> iterator = list.listIterator();
		ListIterator<Character> reverseIterator = list.listIterator(list.size());
		
		boolean isPalindrome = true;
		while (iterator.hasNext() && reverseIterator.hasPrevious()) {
			if (iterator.next() != reverseIterator.previous()) {
				isPalindrome =  false;
				break;
			}
		}
		if (isPalindrome == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}

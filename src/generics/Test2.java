package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		/*
		 * Arraylist<Y> не является подтипом List<X>
		 */
//		X x = new Y();
//		List<X> list1 = new ArrayList<Y>();
		
//		List<Number> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(3.14);
	}
}

class X {
	
}

class Y extends X {
	
}

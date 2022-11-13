package collection.thread_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("Zaur");
		list.add("Oleg");
		list.add("Gennadiy");
		list.add("Yurii");
		list.add("Tatyana");
		list.add("Elena");
		System.out.println(list);
		
		Runnable runnable1 = () -> {
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(iterator.next());
			}
		}; 
		Runnable runnable2 = () -> {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.remove(4);
			list.add("Michael");
		};
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
	}
}

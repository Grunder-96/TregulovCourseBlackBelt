package thread_safe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
	
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Zaur");
		map.put(2, "Oleg");
		map.put(3, "Daniil");
		map.put(4, "Peter");
		map.put(5, "Michael");
		
		Runnable runnable1 = () -> {
			Iterator<Integer> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Integer i = iterator.next();
				System.out.println(i + ": " + map.get(i));
			}
		};
		
		Runnable runnable2 = () -> {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put(6, "Leonid");
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
		System.out.println(map);
	}
}

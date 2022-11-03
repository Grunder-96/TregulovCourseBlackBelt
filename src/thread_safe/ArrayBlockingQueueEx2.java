package thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
	
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
		
		new Thread(() -> {
			int i = 0;
			while (true) {
				try {
					queue.put(++i);
					System.out.println("Producer добавил " + i + " " + queue);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(() -> {
			while (true) {
				try {
					System.out.println("Consumer забрал " + queue.take() + " " + queue);
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}
}

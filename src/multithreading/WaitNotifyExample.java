package multithreading;

public class WaitNotifyExample {
	
	public static void main(String[] args) {
		
		Market market = new Market();
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				market.getBread();
			}
		});
		Thread thread2 = new Thread(() -> { 
			for (int i = 0; i < 10; i++) {
				market.putBread();
			}
		});
		thread1.start();
		thread2.start();
	}
}

class Market {
	
	private int breadCount = 0;
	private final Object lock = new Object();
		
	public void getBread() {
		synchronized (lock) {
			while (breadCount < 1) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			breadCount--;
			System.out.println("Потребитель купил одну буханку хлеба. В магазине осталось " + breadCount);
			lock.notify();
		}
	}
	
	public void putBread() {
		synchronized (lock) {
			while (breadCount >= 5) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			breadCount++;
			System.out.println("На витрину добавлена буханка хлеба. Всего буханок - " + breadCount);
			lock.notify();
		}
	} 
}

//class Producer implements Runnable {
//	
//	Market market;
//	
//	Producer(Market market) {
//		this.market = market;
//	}
//	
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			market.putBread();
//		}
//	}
//}
//
//class Consumer implements Runnable {
//	
//	Market market;
//	
//	Consumer(Market market) {
//		this.market = market;
//	}
//	
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			market.getBread();
//		}
//	}
//}

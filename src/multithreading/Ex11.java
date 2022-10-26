package multithreading;

public class Ex11 {
	
	volatile static int counter = 0;
	
	public static synchronized void increment() {
		
		counter++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		R runnable = new R();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		
		System.out.println(counter);
	}
}

class R implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0 ; i< 100; i++) {
			System.out.println(i);
			Ex11.increment();
		}
	}
	
}

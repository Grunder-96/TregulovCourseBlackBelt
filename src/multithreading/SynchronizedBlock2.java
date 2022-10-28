package multithreading;

public class SynchronizedBlock2 {
	
	volatile static int counter = 0;
	
	public static void increment() {
		synchronized (SynchronizedBlock2.class) {
			counter++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		R2 runnable = new R2();
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

class R2 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0 ; i < 100; i++) {
			System.out.println(i + ": " + Thread.currentThread().getName());
			Ex11.increment();
		}
	}
	
}
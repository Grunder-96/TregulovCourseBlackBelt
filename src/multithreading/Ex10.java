package multithreading;

public class Ex10 {
	
	public static void main(String[] args) {
		
		MyRunnableImplements1 runnable = new MyRunnableImplements1();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class Counter {
	
	volatile static int count = 0;
	
}

class MyRunnableImplements1 implements Runnable {
	
	public synchronized void increment() {
		Counter.count++;
		System.out.print(Counter.count + " ");
		System.out.print(" " + Thread.currentThread().getName() + "\n"); 
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			increment();
		}
	}
}

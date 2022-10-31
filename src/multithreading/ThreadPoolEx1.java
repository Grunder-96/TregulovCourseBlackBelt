package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
	
	public static void main(String[] args) throws InterruptedException {
		
//		ExecutorService eService = Executors.newFixedThreadPool(5);
		ExecutorService eService = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 10; i++) {
			eService.execute(new RunnableImp100());
		}
		eService.shutdown();
		eService.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("Main ends");
	}
}

class RunnableImp100 implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



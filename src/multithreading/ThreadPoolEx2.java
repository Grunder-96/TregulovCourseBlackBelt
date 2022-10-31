package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
	
	public static void main(String[] args)  throws InterruptedException{
		
		ScheduledExecutorService seService = Executors.newScheduledThreadPool(1);
//		for (int i = 0; i < 10; i++) {
//			seService.execute(new RunnableImp200());
//		}
		
//		seService.schedule(new RunnableImp200(), 3, TimeUnit.SECONDS);
		
//		seService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
//		Thread.sleep(20000);
		
		seService.scheduleWithFixedDelay(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		seService.shutdown();
	}
}

class RunnableImp200 implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " begins work");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread().getName() + " ends work");
	}
}

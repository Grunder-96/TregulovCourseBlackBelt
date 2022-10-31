package multithreading;

public class InterruptionEx {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main starts");
		InterruptedThread thread = new InterruptedThread();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
		thread.join();
		System.out.println("Main ends");
	}
}

class InterruptedThread extends Thread {
	
	double sqrtSum = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 1_000_000_000; i ++) {
			if (isInterrupted()) {
				System.out.println("Interrupt()");
				return;
			}
			sqrtSum += Math.sqrt(i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				System.out.println("attempt of interrupt");
				return;
			}
		}
		System.out.println(sqrtSum);
	}
}

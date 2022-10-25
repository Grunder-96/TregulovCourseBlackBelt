package multithreading;

public class Ex9 {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Method main begins");
		Thread thread = new Thread(new Worker());
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
		thread.join(1500);
		System.out.println(thread.getState());
		thread.join();
		System.out.println("Method main ends");
		System.out.println(thread.getState());
	}
}

class Worker implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Work begins");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Work ends");
	}
}

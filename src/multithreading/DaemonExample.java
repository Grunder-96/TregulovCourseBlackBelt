package multithreading;

public class DaemonExample {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread starts");
		UserThread thread1 = new UserThread();
		thread1.setName("user_thread");
		DaemonThread thread2 = new DaemonThread();
		thread2.setName("daemon_thread");
		thread2.setDaemon(true);
				
		thread1.start();
		thread2.start();
		System.out.println("Main thread ends");
	}
}

class UserThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is daemon? - " + isDaemon());
		for (char i = 'A'; i < 'J'; i++) {
			try {
				Thread.sleep(300);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class DaemonThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is daemon? - " + isDaemon());
		for (int i = 1; i < 1000; i++) {
			try {
				Thread.sleep(100);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

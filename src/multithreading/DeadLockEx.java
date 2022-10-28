package multithreading;

public class DeadLockEx {
	
	public static final Object lock1 = new Object();
	public static final Object lock2 = new Object();
	
	public static void main(String[] args) {
		
		Thread10 thread1 = new Thread10();
		Thread20 thread2 = new Thread20();
		
		thread1.start();
		thread2.start();
	}
}

class Thread10 extends Thread {
	
	@Override
	public void run () {
		System.out.println("Thread10: Попытка захватить монитор объекта lock1");
		synchronized (DeadLockEx.lock1) {
			System.out.println("Thread10: Монитор объекта lock1 захвачен");
			System.out.println("Thread10: Попытка захватить монитор объекта lock2");
			synchronized (DeadLockEx.lock2) {
				System.out.println("Thread10: Мониторы объектов lock1 и lock2 захвачены");
			}
		}
	}
}

class Thread20 extends Thread {
	
	@Override
	public void run () {
		System.out.println("Thread20: Попытка захватить монитор объекта lock2");
		synchronized (DeadLockEx.lock2) {
			System.out.println("Thread20: Монитор объекта lock2 захвачен");
			System.out.println("Thread20: Попытка захватить монитор объекта lock1");
			synchronized (DeadLockEx.lock1) {
				System.out.println("Thread20: Мониторы объектов lock2 и lock1 захвачены");
			}
		}
	}
}

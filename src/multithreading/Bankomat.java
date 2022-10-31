package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
	
	public static void main(String[] args) {
		
		Lock lock = new ReentrantLock();
		
		new Employee("Заур", lock);
		new Employee("Аркадий", lock);
		new Employee("Елена", lock);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Employee("Николай", lock);
		new Employee("Анна", lock);
	}

}

class Employee extends Thread{
	
	String name;
	private Lock lock;
	
	public Employee(String name, Lock lock) {
		this.name = name;
		this.lock = lock;
		this.start();
	}
	
	@Override
	public void run() {
		if (lock.tryLock()) {			
//			System.out.println(name + " ждет...");
//			lock.lock();
			try {
				System.out.println(name + " использует банкомат");
				Thread.sleep(2000);
				System.out.println(name + " закончил работу с банкоматом");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println(name + " не хочет ждать в очереди");
		}
	}
}

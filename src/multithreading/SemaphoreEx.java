package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
	
	public static void main(String[] args) {
		Semaphore callBox = new Semaphore(2);
		
		Person person1 = new Person("Николай", callBox);
		Person person2 = new Person("Анна", callBox);
		Person person3 = new Person("Борис", callBox);
		Person person4 = new Person("Анфиса", callBox);
		Person person5 = new Person("Данила", callBox);
	}
}

class Person extends Thread {
	
	String name;
	private Semaphore callBox;
	
	public Person(String name, Semaphore callBox) {
		this.name = name;
		this.callBox = callBox;
		this.start();
	}
	
	@Override
	public void run() {
		try {
			System.out.println(name + " ждет");
			callBox.acquire();
			System.out.println(name + " использует телефон");
			Thread.sleep(2000);
			System.out.println(name + " завершил(а) звонок");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			callBox.release();
		}
	}
}



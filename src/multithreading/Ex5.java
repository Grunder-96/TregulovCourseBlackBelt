package multithreading;

public class Ex5 {
	
	public static void main(String[] args) {
		
		MyThread5 thread1 = new MyThread5();
		System.out.println("name of thread1 - " + thread1.getName() + "; priority of thread1 - " + thread1.getPriority() + ".\n");
		
		thread1.setName("thread1");
		thread1.setPriority(9);
		System.out.println("name of thread1 - " + thread1.getName() + "; priority of thread1 - " + thread1.getPriority() + ".\n");
		
//		MyThread5 thread2 = new MyThread5();
//		System.out.println("name of thread2 - " + thread2.getName() + "; priority of thread2 - " + thread2.getPriority() + ".\n");
	}
}

class MyThread5 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Привет!");
	}
}

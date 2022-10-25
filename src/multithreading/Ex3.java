package multithreading;

public class Ex3 implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 100; i++) {
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Ex3());
		Thread thread2 = new Thread(() -> {
			for (int i = 100; i > 0; i--) {
				System.out.println(i);
			}
		});
		
		thread1.start();
		thread2.start();
	}
}

//class MyThread3 implements Runnable {
//	
//	@Override
//	public void run() {
//		
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
//	}
//}
//
//class MyThread4 implements Runnable {
//	
//	@Override
//	public void run() {
//		
//		for (int i = 100; i > 0; i--) {
//			System.out.println(i);
//		}
//	}
//}

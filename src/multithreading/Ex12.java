package multithreading;

public class Ex12 {
	
//	static final Car monitor = new Car();
	static final Object LOCK = new Object();

	synchronized void mobileCall() {
		synchronized (LOCK) {
			System.out.println(this);
			try {
				System.out.println("Mobile call starts");
				Thread.sleep(3000);
				System.out.println("Mobile call ends");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void skypeCall() {
		synchronized (LOCK) {
			System.out.println(this);
			try {
				System.out.println("Skype call starts");
				Thread.sleep(3000);
				System.out.println("Skype call ends");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void whatsAppCall() {
		synchronized (LOCK) {
			System.out.println(this);
			try {
				System.out.println("WhatsApp call starts");
				Thread.sleep(3000);
				System.out.println("WhatsApp call ends");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new RunnableImpMobile());
		Thread thread2 = new Thread(new RunnableImpSkype());
		Thread thread3 = new Thread(new RunnableImpWhatsApp());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class RunnableImpMobile implements Runnable{
	
	@Override
	public void run() {
		new Ex12().mobileCall();
	}
}

class RunnableImpSkype implements Runnable{
	
	@Override
	public void run() {
		new Ex12().skypeCall();
	}
}

class RunnableImpWhatsApp implements Runnable{
	
	@Override
	public void run() {
		new Ex12().whatsAppCall();
	}
}

//class Car {
//	
//}

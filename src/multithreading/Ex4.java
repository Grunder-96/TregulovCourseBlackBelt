package multithreading;

public class Ex4 {

	public static void main(String[] args) {
		
		new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				System.out.println("Цифра " + i);
			}
		}).start();
		
		new Thread(() -> System.out.println("Привет!")).start();
	}
}

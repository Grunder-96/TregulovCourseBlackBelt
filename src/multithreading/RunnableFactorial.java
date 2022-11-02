package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
	
	static int factorialResult = 1;
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService eService = Executors.newSingleThreadExecutor();
//		eService.execute(new Factorial(6));
		Future future = eService.submit(new Factorial(5));
		eService.shutdown();
		eService.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println(future.get());
		System.out.println(future.isDone());
		System.out.println(factorialResult);
	}
}

class Factorial implements Runnable {
	
	int f;
	public Factorial(int f) {
		this.f = f;
	}
	
	@Override
	public void run() {
		if (f <= 0) {
			System.out.println("invalid value");
			return;
		}
		int result = 1;
		for (int i = 1; i <= f; i++) {
			result *= i;
		}
		RunnableFactorial.factorialResult = result;
	}
}

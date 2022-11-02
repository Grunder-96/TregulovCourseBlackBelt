package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFactorial {
	
	static int factorialResult;
	
	public static void main(String[] args) {
		
		ExecutorService eService = Executors.newSingleThreadExecutor();
		Factorial2 factorial = new Factorial2(5);
		Future<Integer> future  = eService.submit(factorial);
		try {
			System.out.println(future.isDone());
			System.out.println("Хотим получить результат");
			factorialResult = future.get();
			System.out.println("Результат получен");
			System.out.println(future.isDone());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println(e.getCause());
		} finally {
			eService.shutdown();
		}
		System.out.println(factorialResult);
	}
}

class Factorial2 implements Callable<Integer> {
		
	int f;
	
	public Factorial2(int f) {
		this.f = f;
	}
	
	@Override
	public Integer call() throws Exception{
		if (f < 0) {
			throw new Exception("Incorrect value");
		}
		int result = 1;
		for (int i = 1; i <= f; i++) {
			result *= i;
			Thread.sleep(1000);
		}
		return result;
	}
}

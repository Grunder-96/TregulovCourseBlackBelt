package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {
	
	private static long value = 1_000_000_000L;
	private static long sum = 0;
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Future<Long>> futureResults = new ArrayList<>();
		long valueDividedBy10 = value / 10;
		for (int i = 0; i < 10; i++) {
			long from = valueDividedBy10 * i + 1;
			long to = valueDividedBy10 * (i + 1);
			futureResults.add(executorService.submit(new PartialSum(from, to)));
		}
		executorService.shutdown();
		for (Future<Long> future : futureResults) {
			try {
				sum += future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(sum);
	}
}

class PartialSum implements Callable<Long> {
	
	long from;
	long to;
	long localSum;
	
	public PartialSum(long from, long to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public Long call() {
		for (long i = from; i <= to; i++) {
			localSum += i;
		}
		System.out.println("Sum from " + from + " to " + to + " - " + localSum);
		return localSum;
	}
}

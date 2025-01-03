public class Main {

	public static void main(String[] args) {
		MultiThreading multi = new MultiThreading();
		Future<?> futureObj = multi.exec.submit(() ->{
			System.out.println("Task");
		});
		System.out.print("FutureObj "+futureObj.isDone());
	}
}

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreading {
	ThreadPoolExecutor exec = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2));
}

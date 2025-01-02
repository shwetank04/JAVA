
public class Main {

	public static void main(String[] args) {
		System.out.println("Before MultiThreading "+Thread.currentThread().getName());
		MultiThreading multiThreading = new MultiThreading();
		Thread thread = new Thread(multiThreading);
		thread.start();
	}
}

public class MultiThreading implements Runnable {

	@Override
	public void run() {
		System.out.println("Invoking thread from multithreading "+Thread.currentThread().getName());
	}
}

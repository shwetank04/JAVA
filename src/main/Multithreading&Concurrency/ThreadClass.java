public class Main {

	public static void main(String[] args) {
		System.out.println("Before MultiThreading "+Thread.currentThread().getName());
		MultiThreading multiThreading = new MultiThreading();
		multiThreading.start();
	}
}

public class MultiThreading extends Thread {

	@Override
	public void run() {
		System.out.println("Invoking thread from multithreading "+Thread.currentThread().getName());
	}
}

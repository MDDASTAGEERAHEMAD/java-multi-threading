package multiThreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("interface");

	}

	public static void main(String[] args) {

		System.out.println(" -------- Out Put by Implmenting Runnable Interface -------");
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setName("md");

		System.out.println(Thread.currentThread().getThreadGroup());

		System.out.println(Thread.NORM_PRIORITY + "" + Thread.currentThread().getState() + " "
				+ Thread.currentThread().isDaemon());

		System.out.println(Thread.currentThread().getName());

		MyRunnable m = new MyRunnable();
		Thread t = new Thread(m);
		t.start();

	}
}
package multiThreading;

public class ThreadA {

	public static void main(String[] args) throws Exception {

		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {
			System.out.println("main Thread call Wait Method");
			b.wait();

			System.out.println("Main thread got Notification");

			System.out.println(b.total);

		}

	}

}

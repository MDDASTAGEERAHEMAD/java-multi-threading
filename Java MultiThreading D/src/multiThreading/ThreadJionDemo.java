package multiThreading;

public class ThreadJionDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread2.mt = Thread.currentThread();

		MyThread2 t = new MyThread2();
		t.start();

		// t.join();

		for (int i = 0; i < 10; i++) {

			System.out.println(" Main Thread ");

		}

	}

}

package multiThreading;

public class MyThread2 extends Thread {

	static Thread mt;

	public void run() {

		try {
			mt.join();
		}

		catch (InterruptedException e) {
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("I am child Thread");

		}

	}

}

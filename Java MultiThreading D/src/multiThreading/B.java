package multiThreading;

public class B {

	public synchronized void d2(A a) {

		System.out.println("Thread 2 starts Execution of d2 Method");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			System.out.println("Thread 2 trying to call A's last() method");
			a.last();
		}
	}

	public synchronized void last() {

		System.out.println("inside B this last() method");

	}

}

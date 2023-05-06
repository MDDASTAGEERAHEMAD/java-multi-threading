package multiThreading;

public class A {

	public synchronized void d1(B b) {

		System.out.println("Thread 1 Start Execution of d1() method");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}

		System.out.println("Thread 1 trying to call B's last() method  ");
		b.last();

	}

	public synchronized void last() {

		System.out.println("Inside A this is Last() method");
	}

}

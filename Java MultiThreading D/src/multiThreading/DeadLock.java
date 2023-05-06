package multiThreading;

public class DeadLock extends Thread {

	A a = new A();

	B b = new B();

	public void m1() {
		this.start();

		a.d1(b); // This line executed by main thread

	}

	public void ru() {

		b.d2(a); // This line is executed by Child Thread

	}

	public static void main(String[] args) {

		DeadLock d = new DeadLock();
		d.m1();

	}

}

package multiThreading;

public class MyThreadSleep extends Thread {

	Display d;
	String name;

	MyThreadSleep(Display d, String name) {

		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}

}

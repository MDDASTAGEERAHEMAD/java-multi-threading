package multiThreading;

public class SleepThreadDemo {

	public static void main(String[] args) {

		Display d = new Display();

		MyThreadSleep t1 = new MyThreadSleep(d, "Dhoni");
		MyThreadSleep t2 = new MyThreadSleep(d, "Yuvraj");
		t1.start();
		t2.start();
	}

}

package multiThreading;

public class MyThread {

	public static void main(String[] args) {

		YeildMethodDemo y = new YeildMethodDemo();
		y.start();

		try {
			y.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread -----");
		}
	}

}

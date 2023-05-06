package multiThreading;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {

		Runmethod r = new Runmethod();

		System.out.println(" -------- Out Put by Extending Thread Class  -------");

		r.start();
		// r.join();
		// r.run(565);

		for (int i = 0; i < 10; i++) {
			System.out.println("Executed By Main Thread");

		}
	}

}

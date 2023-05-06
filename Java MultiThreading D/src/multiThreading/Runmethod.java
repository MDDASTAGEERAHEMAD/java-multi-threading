package multiThreading;

public class Runmethod extends Thread {

	/*
	 * public void start() {
	 * 
	 * super.start(); System.out.println("start method");
	 * 
	 * }
	 */
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("hello child");

		}

	}

	/*
	 * public void run(int i ){ // i = 67; System.out.println("overload " + i);
	 * }
	 */

}
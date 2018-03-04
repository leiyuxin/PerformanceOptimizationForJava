package leiyuxin.performance.ch4.vol;

import org.junit.Test;

public class VolatileTest {
	volatile boolean isExit;

	public void tryExit() {
		if (isExit == !isExit) {
			System.out.println("exit");
			// System.exit(0);
		}
	}

	public void swapValue() {
		isExit = !isExit;
	}

	// @Test
	// public void test() throws InterruptedException {
	//
	// }
	public static void main(String[] args) {
		final VolatileTest volObj = new VolatileTest();
		Thread mainThread = new Thread() {
			public void run() {
				System.out.println("mainThread start");
				while (true) {
					volObj.tryExit();
				}
			}
		};
		mainThread.start();
		Thread swapThread = new Thread() {
			public void run() {
				System.out.println("swapThread start");
				System.out.println(
						Thread.currentThread().getName() + ": is or deamo" + Thread.currentThread().isDaemon());
				while (true) {
					volObj.swapValue();
				}
			}
		};

		swapThread.start();
		// swapThread.join();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
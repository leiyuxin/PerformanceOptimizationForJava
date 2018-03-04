package leiyuxin.performance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import leiyuxin.performance.singleton.LazySingleton;
import leiyuxin.performance.singleton.Singleton;
import leiyuxin.performance.singleton.StaticSingleton;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		final long begintime = System.currentTimeMillis();
		ExecutorService service = Executors.newScheduledThreadPool(100);

		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("startPromptly");
				for (int i = 0; i < 1000000; i++) {
					long start = System.currentTimeMillis();
					Singleton.getInstance();
					long end = System.currentTimeMillis();
					if (i == 0) {
						System.out.println("promptlySpend:" + (end - start) + Thread.currentThread().getName());
					}
				}
			}

		};

		Runnable task2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("startLazy");
				for (int i = 0; i < 1000000; i++) {
					long start = System.currentTimeMillis();
					LazySingleton.getInstancePrivate();
					long end = System.currentTimeMillis();
					if (i == 0) {
						System.out.println("LaySpend111:" + (end - start) + Thread.currentThread().getName());
					}
				}
			}

		};
		Runnable task3 = new Runnable() {

			@Override
			public void run() {
				System.out.println("startstaticLazy");
				for (int i = 0; i < 1000000; i++) {
					long start = System.currentTimeMillis();
					StaticSingleton.getInstance();
					long end = System.currentTimeMillis();
					if (i == 0) {
						System.out.println("staticLazy:" + (end - start) + Thread.currentThread().getName());
					}
				}
			}

		};
		// for (int i = 0; i < 5; i++) {
		// service.submit(task);
		// }
		for (int i = 0; i < 1000; i++) {
			service.submit(task3);
		}

	}
}

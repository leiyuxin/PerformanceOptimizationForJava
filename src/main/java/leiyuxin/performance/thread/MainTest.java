package leiyuxin.performance.thread;

public class MainTest {
	public static void main(String[] args) {
		System.out.println(" parent thread begin ");
		Thread.currentThread().setDaemon(true);
		System.out.println("test");
	}
}

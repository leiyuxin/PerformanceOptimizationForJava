package leiyuxin.performance.thread;

public class ParentDaemon {

	public static void main(String[] args) {
		System.out.println("parent thread begin ");

		ChildThread1 t1 = new ChildThread1("thread1");
		ChildThread1 t2 = new ChildThread1("thread2");
		t1.setDaemon(true);
		t2.setDaemon(true);

		t1.start();
		t2.start();

		System.out.println("parent thread over ");
	}
}

class ChildThread1 extends Thread {
	private String name = null;

	public ChildThread1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name + "--child thead begin");
		try {
			Thread.sleep(500);
			while (true) {
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(this.name + "--child thead over");
	}
}
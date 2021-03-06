package leiyuxin.performance.ch4.gs.future;

import java.util.LinkedList;

public class RequestQueue {
	private LinkedList queue = new LinkedList();

	public synchronized Request getRequest() {
		while (queue.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return (Request) queue.remove();
	}

	public synchronized void addRequest(Request request) {
		queue.add(request);
		notifyAll();
	}

	public boolean isEmpty() {
		return queue.size() <= 0;
	}
}

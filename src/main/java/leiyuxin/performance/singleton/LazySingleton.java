package leiyuxin.performance.singleton;

public class LazySingleton {
	private static LazySingleton instance = null; // 确认系统没有额外的负载
	private static Object privateLock = new Object(); // 定义私有锁。

	private LazySingleton() {

	}

	public static LazySingleton getInstanceBolck() {
		synchronized (LazySingleton.class) {
			if (instance == null) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}

	public static LazySingleton getInstancePrivate() {
		synchronized (privateLock) {
			if (instance == null) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;

	}

}

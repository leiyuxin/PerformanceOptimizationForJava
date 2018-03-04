package leiyuxin.performance.singleton;

import java.io.Serializable;

public class SerSingleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;

	private SerSingleton() {
		name = "sersingleton";
	}

	private static SerSingleton instance = new SerSingleton();

	public static SerSingleton getInstance() {
		return instance;
	}

	public static void createString() {
		System.out.println("CreateString in Singleton");
	}

	private Object readResolve() {
		return instance;
	}
}

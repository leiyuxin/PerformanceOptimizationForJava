package leiyuxin.performance.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//非延迟加载主要是在使用类的时候都加载，缺点当使这个其他类的方法时候实例还是被创建出来的
public class Singleton {
	private static Singleton instance = new Singleton();
	private static final Logger log = LoggerFactory.getLogger(Singleton.class);

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	public static void createString() {// 这是模拟单例类扮演其他角色的时候
		log.info("create instance in load class");
	}

	public static void main(String[] args) {
		Singleton.createString();
	}
}

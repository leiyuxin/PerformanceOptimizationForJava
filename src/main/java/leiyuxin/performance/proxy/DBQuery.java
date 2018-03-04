package leiyuxin.performance.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import leiyuxin.performance.singleton.Singleton;

public class DBQuery implements IDBQuery {
	private static final Logger log = LoggerFactory.getLogger(Singleton.class);

	public DBQuery() {
		// 可能包含数据库连接等耗时操作
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String request() {
		log.info("request string");
		return "request string";
	}
}

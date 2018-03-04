package leiyuxin.performance.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import junit.framework.Assert;

public class SingletonTest {

	public void testSingletonGetInstance() {
		final long begintime = System.currentTimeMillis();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("start");
				for (int i = 0; i < 10000; i++) {
					Singleton.getInstance();
					System.out.println("spend:" + (System.currentTimeMillis() - begintime));
				}
			}

		}).start();
		new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				Singleton.getInstance();
				System.out.println("spend:" + (System.currentTimeMillis() - begintime));
			}
		}).start();

	}

	@Test
	public void test() throws IOException, ClassNotFoundException {
		SerSingleton s1 = null;
		SerSingleton s = SerSingleton.getInstance();
		FileOutputStream fos = new FileOutputStream("SerSingleton.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("SerSingleton.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		s1 = (SerSingleton) ois.readObject();
		Assert.assertEquals(s, s1);
	}
}

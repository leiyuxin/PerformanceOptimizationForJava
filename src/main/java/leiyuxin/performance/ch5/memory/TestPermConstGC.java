package leiyuxin.performance.ch5.memory;

import org.junit.Test;

/**
 * -XX:PermSize=2M -XX:MaxPermSize=4M -XX:+PrintGCDetails
 * @author Administrator
 *
 */
public class TestPermConstGC {
	static String staticString = "222";
	//@Test
	public static void permGenGC() {
	    for (int i = 0; i < Integer.MAX_VALUE; i++) {
	        String t = String.valueOf(i).intern();
	    }
	}
	public static void main(String[] args) {
		permGenGC();
		System.out.println(staticString);
	}
}

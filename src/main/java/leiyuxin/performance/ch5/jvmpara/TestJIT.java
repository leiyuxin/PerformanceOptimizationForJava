package leiyuxin.performance.ch5.jvmpara;

/**
 * -XX:CompileThreshold=1500 -XX:+PrintCompilation -XX:+CITime
 * 
 * @author Administrator
 * 
 */
public class TestJIT {
	static long i = 0;

	public static void testJIT() {
		i++;
	}
	public static void main(String args[]) {
		for (int j = 0; j < 1460; j++)
			testJIT();
		long end = System.currentTimeMillis();
	}
}

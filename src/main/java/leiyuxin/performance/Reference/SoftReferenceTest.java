package leiyuxin.performance.Reference;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {

	public static void main(String[] args) {
		SoftReference ref = new SoftReference(new MyDate());
		Object o = ref.get();
		System.out.println(o);
		ReferenceTest.drainMemory();
	}
}
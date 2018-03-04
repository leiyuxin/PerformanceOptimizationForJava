package leiyuxin.performance.Reference;

public class StrongReferenceTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		System.out.println(date);
		System.gc();
	}
}
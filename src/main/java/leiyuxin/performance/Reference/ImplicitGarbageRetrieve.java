package leiyuxin.performance.Reference;

public class ImplicitGarbageRetrieve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate();
		date = null;
		ReferenceTest.drainMemory();
		System.out.println("end");
	}

}
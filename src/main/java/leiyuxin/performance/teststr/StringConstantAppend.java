package leiyuxin.performance.teststr;

public class StringConstantAppend {
	public static void main(String[] args) {
		long startTime, endTime;
		String result;
		final int count = 50000;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			result = "String" + "and" + "append";
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("String");
			sb.append("and");
			sb.append("append");
		}

		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}
}

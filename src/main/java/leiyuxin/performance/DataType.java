package leiyuxin.performance;

//只要参与预算结果最低是int 类型
public class DataType {
	public static void main(String args[]) {
		byte b = 50;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println(result);
		byte e = 1;
		byte g = 2;
		e += g;

		byte b1 = 1, b2 = 2, b3, b6;
		final byte b4 = 4, b5 = 6;
		b6 = b4 + b5;
		b3 = (byte) (b1 + b2); // 会发生编译错误

		byte bb;
		bb = 3;
		bb = (byte) ((byte) b * 3); // 编译出错，因为(byte)的运算级别比*高,所以会先转换b后再*3
		bb = (byte) (b * 3); // 正确
		System.out.println(b3 + b6);

	}
}

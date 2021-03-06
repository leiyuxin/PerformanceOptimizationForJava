package leiyuxin.performance.timespace;

public class UnsignedByte {
	public short getValue(byte i) {
		short li = (short) (i & 0xff);
		return li;
	}

	public byte toUnsignedByte(short i) {
		byte value = (byte) (i);
		System.out.println(value);
		return value;
	}

	public static void main(String args[]) {
		UnsignedByte ins = new UnsignedByte();
		short[] shorts = new short[256];
		System.out.println();
		for (int i = 0; i < shorts.length; i++)
			shorts[i] = (short) i;
		byte[] bytes = new byte[256];
		for (int i = 0; i < bytes.length; i++)
			bytes[i] = ins.toUnsignedByte(shorts[i]);
		for (int i = 0; i < bytes.length; i++)
			System.out.print(ins.getValue(bytes[i]) + " ");
	}
}
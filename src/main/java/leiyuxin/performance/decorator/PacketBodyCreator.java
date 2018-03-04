package leiyuxin.performance.decorator;

public class PacketBodyCreator implements IPacketCreator {
	@Override
	public String handleContent() {
		return "Content of Packet"; // 构造核心数据
	}
}
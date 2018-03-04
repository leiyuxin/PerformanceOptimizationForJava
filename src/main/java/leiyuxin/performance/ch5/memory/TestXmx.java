package leiyuxin.performance.ch5.memory;

import java.util.Vector;

import org.junit.Test;

/**
 * -Xmx11M
 * @author Administrator
 *
 */
public class TestXmx {
	public static void main(String args[]){
		Vector v=new Vector();
		for(int i=1;i<=10;i++){
			byte[] b=new byte[1024*1024];
			v.add(b); // 强引用,使GC 时不能释放空间
			System.out.println(i+"M is allocated");//分配1M 堆内存
		}
		System.out.println("Max memory:"+Runtime.getRuntime().maxMemory()/1024/1024+"M");
	}
}

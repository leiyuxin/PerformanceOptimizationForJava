package leiyuxin.performance.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class MapGetPut {
	Map map;
	final int CIRCLE1 = 100000;

	protected void testGet(String funcname) {
		for (int i = 0; i < CIRCLE1; i++) {
			String key = Double.toString(Math.random());
			map.put(key, key);
		}
		long starttime = System.currentTimeMillis();
		for (int i = 0; i < CIRCLE1; i++) {
			String key = Double.toString(Math.random());
			map.get(key);
		}
		long endtime = System.currentTimeMillis();
		System.out.println(funcname + ": " + (endtime - starttime));
	}

	@Test
	public void testHashtableGet() {
		map = new Hashtable();
		testGet("testHashtableGet");
	}

	@Test
	public void testSyncHashMapGet() {
		map = Collections.synchronizedMap(new HashMap());
		testGet("testSyncHashMapGet");
	}

	@Test
	public void testHashMapGet() {
		map = new HashMap();
		testGet("testHashMapGet");
	}

	@Test
	public void testHashMap() {
		map = new LinkedHashMap(16, 0.75f, true);
		map.put("1", "aa");
		map.put("2", "bb");
		map.put("3", "cc");
		map.put("4", "dd");
		for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name + "->" + map.get(name));
		}
	}
}

package com.prits.oom;

import java.util.Map;
import java.util.Random;

/**
 * Sample program to generate out of memory - gc overhead limit exceeded
 * 
 */
public class OOM_GCOverhead_Limit {
	public static void main(String[] args) {

		System.out.println("Starting sample program to generate out of memory - GC overhead limit exceeded");
		Map map = System.getProperties();
		Random r = new Random();
		while (true) {
			map.put(r.nextInt(), "value");
		}
	}
}

package com.prits.oom;

import javassist.ClassPool;

/**
 * 
 * This sample program generates Out Of Memory - Permgen space error
 * @author Pritesh Patel
 *
 */
public class OOM_PermgenSpace {

	public static void main(String[] args) throws Exception {
		System.out.println("Sample program to generate OOM - permgen space");
		for (int i = 0; i < 100000000; i++) {
			generate("eu.plumbr.demo.Generated" + i);
		}
	}

	public static Class generate(String name) throws Exception {
		ClassPool pool = ClassPool.getDefault();
		return pool.makeClass(name).toClass();
	}
}

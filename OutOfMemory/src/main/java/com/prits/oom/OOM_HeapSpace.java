package com.prits.oom;

import java.util.HashMap;
import java.util.Map;

/**
 * This sample program generate Out Of Memory - heap space error.
 * 
 * @author Pritesh Patel
 *
 */
public class OOM_HeapSpace {

	static class Key {
	      Integer id;
	 
	      Key(Integer id) {
	         this.id = id;
	      }
	 
	      @Override
	      public int hashCode() {
	         return id.hashCode();
	      }
	   }
	 
	   public static void main(String[] args) {
		   System.out.println("Starting sample program to generate OOM- HeapSpace");
	      Map m = new HashMap();
	      while (true)
	         for (int i = 0; i < 10000; i++)
	            if (!m.containsKey(new Key(i)))
	               m.put(new Key(i), "Number:" + i);
	   }
}

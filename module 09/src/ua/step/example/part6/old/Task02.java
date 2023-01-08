package ua.step.example.part6.old;

import java.util.Hashtable;

/**
 * 
 * Hashtable - устаревщий аналог HashMap
 *
 */
public class Task02 {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(null, "");
		hashtable.put(1, null);
	}
}

package ua.step.example.part2.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Количесвто элементов 
 * -Xmx1024m -Xms256m
 */
public class Task07 {
	public static void main(String[] args) {
		List<Byte> bytes = new ArrayList<Byte>();
		try {
			for (int i = 0; i <= Integer.MAX_VALUE; i++) {
				bytes.add(Byte.MAX_VALUE);
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Size ArrayList for byte: " + bytes.size());
		}

		bytes = new LinkedList<Byte>();
		try {
			for (int i = 0; i <= Integer.MAX_VALUE; i++) {
				bytes.add(Byte.MAX_VALUE);
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Size LinkedList for byte: " + bytes.size());
		}
		bytes.clear();
		
		List<Double> doubles = new ArrayList<Double>();
		try {
			for (int i = 0; i <= Double.MAX_VALUE; i++) {
				doubles.add(Double.MAX_VALUE);
			}
		} catch (OutOfMemoryError e) {
			System.out.println(doubles.size());
		}
	}
}

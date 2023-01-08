package ua.step.example.part3.set;

import java.util.BitSet;

/**
 * 
 * Набор битов
 * 
 */
public class Task09 {
	public static void main(String[] args) {
		BitSet bitSet = new BitSet();
		long[] array = { 1, 2, 3 };
		bitSet = BitSet.valueOf(array);
		System.out.println(bitSet);

		long[] tmp = bitSet.toLongArray();
		for (long number : tmp) {
			System.out.println(number);
		}

		System.out.println(bitSet.previousSetBit(1));
		System.out.println(bitSet.previousClearBit(66));
	}
}

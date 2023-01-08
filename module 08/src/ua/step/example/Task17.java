package ua.step.example;

import java.util.Random;

/**
 * 
 * Ловля исключений из разных веток иерархии
 *
 */
public class Task17 {
	public static void main(String[] args) {
		try {
			Random rnd = new Random();
			if (rnd.nextBoolean()) {
				throw new Error();
			} else {
				throw new RuntimeException();
			}
		} catch (Error e) {
			System.err.println("error");
		} catch (RuntimeException e) {
			System.err.println("runtime");
		}
	}
}

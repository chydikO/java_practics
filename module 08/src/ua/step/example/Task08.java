package ua.step.example;

import java.io.IOException;

/**
 * Можно напугать даже тем, чего быть не может.
 *
 */
public class Task08 {
	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Объявление метода обязывает всех кто его будет использовать обрабатывать
	 * исключение IOException, хотя внутри метода исключение не бросается. 
	 */
	private static void test() throws IOException {
		// разкомментируй меня
		// throw new Exception(); 
	}
}

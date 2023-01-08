package ua.step.example;

import java.io.EOFException;
import java.io.FileNotFoundException;

/**
 * Если вы часть перехватили, то можете этим уже не пугать
 * 
 */
public class Task09 {
	public static void main(String[] args) {
		// разкоментируй меня
		// f();
	}

	/**
	 * 
	 * В методе может быть брошено два проверяемых исключения, но наверх
	 * пробрасываем только одно, другое ловится внутри метода.
	 */
	public static void f() throws FileNotFoundException {
		try {
			if (System.currentTimeMillis() % 2 == 0) {
				// перехвачено в блоке try
				throw new EOFException("EOF");
			} else {
				// не перехвачено
				throw new FileNotFoundException();
			}
		} catch (EOFException e) {
			System.out.println("Catched " + e.getMessage());
		}
	}
}

package ua.step.example;

/**
 * 
 * Когда поймали одно исключение, в блоке catch можем бросить другое, которое не
 * будет поймано блоком try
 *
 */
public class Task13 {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
			// System.out.println("опа");
		} catch (NullPointerException npe) {
			System.err.println(1);
			throw new ArithmeticException();
		} catch (ArithmeticException ae) {
			System.err.println(2);
		}
		System.err.println(3);
	}
}

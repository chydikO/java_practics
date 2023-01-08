package ua.step.example;

/**
 * 
 * Ответ на «главный вопрос Жизни, Вселенной и Всего такого».
 *
 */
public class Task19 {
	public static void main(String[] args) {
		try {
			// прекращение работы виртуальной java-машины (JVM)
			Runtime.getRuntime().exit(42);
			// прекращение работы виртуальной java-машины (JVM)
			System.exit(42); 
			// осуществляет немедленное прекращение работы виртуальной
			// java-машины (JVM). Не завершает запушенных паралельно процессов.
			Runtime.getRuntime().halt(42);
			
		} finally {
			System.err.println("finally"); // не будет вызван
		}
	}
}

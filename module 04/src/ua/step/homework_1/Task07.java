package ua.step.homework_1;

import java.util.Scanner;

/**
 * Показать битовое представление значения переменной типа int, используя только
 * один цикл, управляющую переменную, принт, и побитовые сдвиги << и >>>. Не
 * использовать строки и любые другие готовые функции (методы). Число должно
 * вводится с клавиатуры.
 *
 */
public class Task07 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		boolean isInt = scanner.hasNextInt();
		int value = scanner.nextInt();

		scanner.close();
	}
}

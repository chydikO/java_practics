package ua.step.homework_1;

import java.util.Scanner;

/**
 * Напишите программу, которая будет проверять является ли число введённое с
 * клавиатуры палиндромом (одинаково читающееся в обоих направлениях). Например
 * 123454321 или 221122 — палиндром. Не использовать строки. Если число
 * полиндром программа должна вывести Yes иначе No
 */
public class Task05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		boolean isInt = scanner.hasNextInt();
		int value = scanner.nextInt();
		
		scanner.close();
	}
}

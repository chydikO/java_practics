package ua.step.example;

import java.util.Scanner;

/**
 * 
 * Ловим сразу два типа исключений
 *
 */
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] m = new int[1];
		try {
			System.out.println("Введите 0 или 1");
			int a = sc.nextInt();
			
			// TODO если значение a==0 возникает исключительная ситуация
			m[a] = 4 / a;
			// TODO если значение a > 1 или a < 0 возникает исключительная
			// ситуация
			System.out.println(m[a]);
		} catch (ArithmeticException e) {
			System.out.println("Произошла недопустимая арифметическая операция");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Обращение по недопустимому индексу массива");
		}
		sc.close();
	}
}

package ua.step.example;

import java.util.Scanner;

/**
 * 
 * finally секция
 *
 */
public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Введите 0 или 1");
			int a = sc.nextInt();
			// TODO если значение a==0 возникает исключительная ситуация
			int b = 4 / a;
			System.out.println(b);
			//System.exit(42); 
		} catch (ArithmeticException e) {
			System.out.println("Произошла недопустимая арифметическая операция");
		}
		finally {
			System.out.println("Выполняется в любом случае");
		}
		sc.close();
	}
}

package ua.step.example;

/**
 * 
 * Ловля исключений 
 *
 */
public class Task02 {
	public static void main(String[] args) {
		try // ключевое слово для ловли исключений в программе
		{ // открываем блок в котором будем ловить исключения
			int a = 1;
			System.out.println(a / 0);
		} // закрываем блок в котором будем ловить исключения
		// в параметрах catch указываем тип  исключения которое ловим
		catch (ArithmeticException e) {
			//e.printStackTrace(); // выводит стэк ошибки в консольe.
			System.out.println("Произошла недопустимая арифметическая операция");
		}
	}
}

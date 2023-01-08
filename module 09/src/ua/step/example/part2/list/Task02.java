package ua.step.example.part2.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * Добавление элементов в список
 *
 */
public class Task02 {
	public static void main(String[] args) {
		final int n = 100;
		Random rnd = new Random();
		// в скобках может указыватся начальная емкость списка (если не указана она равно 10)
		List<Integer> list = new ArrayList<Integer>(/* n */); 
		long timeStart = System.nanoTime();
		for (int i = 0; i < n; i++) {
			list.add(rnd.nextInt(n));
			//list.add(i);
		}
		System.out.println("time " + (System.nanoTime()- timeStart));
		System.out.println(list); // метод toString перегружен
		
		int i = list.get(n / 2); // возврашение элемента по индексу
		System.out.println(i);
	}
}
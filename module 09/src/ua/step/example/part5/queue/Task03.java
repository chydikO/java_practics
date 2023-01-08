package ua.step.example.part5.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * 
 * Компоратор для очереди с приоритетами.
 * Установка проиоритета. 
 * 
 */
public class Task03 {
	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer value1, Integer value2) {

				return value2 - value1;
			}
		};
		// создаем приоритетную очередь с компаратором
		Queue<Integer> queue = new PriorityQueue<Integer>(10, comparator);
		final Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			queue.add(rnd.nextInt(100));
		}

		while (!queue.isEmpty()) {
			Integer element = queue.remove();
			System.out.println(queue);
		}
	}
}

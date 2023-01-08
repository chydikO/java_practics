package ua.step.example.part2.list;

import java.util.List;
import static java.util.Arrays.*;

/**
 * 
 * Подсписки (subList)
 *
 */
public class Task09 {
	public static void main(String[] args) {
		List<Integer> theNumbers = asList(4, 8, 15, 16, 23, 42);
		int size = theNumbers.size();
		// обход колекции исключая 1 и последний элемент
		for (Integer number : theNumbers.subList(1, size - 2)) {
			System.out.print(number + ", ");
		}
		System.out.println(theNumbers.get(size - 1));
	}
}

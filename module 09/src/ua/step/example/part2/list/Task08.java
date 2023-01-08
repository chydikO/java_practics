package ua.step.example.part2.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.*;
/**
 * 
 * Инициализация списков
 *
 */
public class Task08 {
	public static void main(String[] args) {
		// вариант 1
		List<Integer> theNumbers1 = new LinkedList<Integer>();
		Collections.addAll(theNumbers1, 4, 8, 15, 16, 23, 42);
		System.out.println(theNumbers1);
		
		//вариант 2
		List<Integer> theNumbers2 = new LinkedList<Integer>(Arrays.asList(42, 23, 16, 15, 8, 2));
		System.out.println(theNumbers2);
		
		//вариант 3 с использованием статического импорта 
		List<Integer> theNumbers3 = new ArrayList<Integer>(asList(1, 2, 3, 4, 5, 6));
		System.out.println(theNumbers3);
		
		//вариант 4 ВНИМАНИЕ!!! колекция будет не изменяемой 
		List<Integer> theNumbers4 = asList(4, 6, 1, 6, 83, 4);
		theNumbers4.add(54); // ошибка во время выполнения
		System.out.println(theNumbers4);
		
		// создание колекции с одним элементом. 
		List<Integer> singeltonList = Collections.singletonList(5);
		singeltonList.add(3); // колекция будет не изменяемой
		System.out.println(singeltonList);
		
		// создание пустого, не изменяемого списка
		List<Integer> emptyList = Collections.emptyList();
		System.out.println(emptyList);
	}
}

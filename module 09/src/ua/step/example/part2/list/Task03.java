package ua.step.example.part2.list;

import java.util.LinkedList;

/**
 * 
 * Связный спи́сок — базовая динамическая структура данных в информатике,
 * состоящая из узлов, каждый из которых содержит как собственно данные, так и
 * две ссылки («связки») на следующий и предыдущий узел списка.
 *
 */
public class Task03 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.addFirst(1);
		linkedList.addLast(3);
		System.out.println(linkedList);
		linkedList.add(1, 6);
		System.out.println(linkedList);

		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(7);
		System.out.println(linkedList);

		int first = linkedList.getFirst();
		System.out.println("first = " + first);

		Integer last = linkedList.getLast();
		System.out.println("last = " + last);
	}
}

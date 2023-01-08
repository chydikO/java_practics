package ua.step.example.part4.map;

import java.util.Hashtable;

/**
 * Главное отличие Hashtable от HashMap в том, что методы класса Hashtable
 * синхронизированы, а HashMap - нет. Кроме этого класс HashMap в отличии от
 * Hashtable разрешает использование null в качестве ключей и значений.
 * 
 * Наличие синхронизации в Hashtable уменьшает производительность кода,
 * использующего данный класс. Поэтому классы JCF (Java Collections Framework,
 * появившийся в Java 2), в том числе и HashMap, несинхронизированы. Если
 * синхронизация все же нужна, можно использовать методы класса Collections:
 * Collections.synchronizedMap(map), Collections.synchronizedList(list) или
 * Collections.synchronizedSet(set).
 * 
 * Данные методы возвращают синхронизированный декоратор переданной коллекции.
 * При этом все равно в случае итерирования по коллекции требуется ручная
 * синхронизация.
 * 
 * Начиная с Java 6 JCF был расширен специальными коллекциями, поддерживающими
 * многопоточный доступ, такими как CopyOnWriteArrayList и ConcurrentHashMap.
 * 
 */
public class Task07 {
	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("test1", 1);
		hashtable.put("test2", 2);
		System.out.println(hashtable);

		hashtable.put(null, 2); // ошибка
		hashtable.put("2", null); // ошибка
	}
}

package ua.step.example.part3.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Коллекторы. Стрим в коллекцию.
 *
 */
public class Task11
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12, 14);
        // Сохранение результатов над стримом в коллекцию
        List<Integer> list2 = list.stream().map((x) -> x + x).collect(Collectors.toList());
        list2.forEach(System.out::println);

        // вызов Collectors.toList() можно развернуть
        list.stream().collect(() -> new ArrayList<>(), (l, t) -> l.add(t), (l1, l2) -> l1.addAll(l2));

        // тоже самое но с метод references
        list.stream().collect(ArrayList::new, List::add, List::addAll);
    }
}
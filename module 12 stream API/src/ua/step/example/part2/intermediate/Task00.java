package ua.step.example.part2.intermediate;

import java.util.stream.Stream;

import ua.step.example.model.Data;

/**
 * Фильтр - метод filter принимает Predicate
 */
public class Task00
{
    public static void main(String[] args)
    {
        Stream<String> stream = Data.getList().stream();
        stream.
        // промежуточная операция фильтрует поток
                filter((s) -> s.startsWith("a")).
                // терминальная операция
                forEach(System.out::println);
        // FIXME 1 выведи все элементы списка которые начинаются и заканчиваются
        // на букву a используя несколько фильтров
        
        // FIXME 2 выведи все элементы списка которые содержат цифру 1
    }
}
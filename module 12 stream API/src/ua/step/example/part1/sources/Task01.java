package ua.step.example.part1.sources;

import java.util.stream.Stream;

/**
 * Пустой стрим
 */
public class Task01
{
    public static void main(String[] args)
    {
        Stream.empty().forEach(System.out::println);
        // Вывода нет, так как стрим пустой.
    }
}
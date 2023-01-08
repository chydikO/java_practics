package ua.step.example.part1.sources;

import java.util.stream.Stream;

/**
 * 
 * Генерация бесконечного стрима.
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.generate(()-> "a1").limit(20);
        // если в строке 14 убрать метод limit, то вывод будет бесконечным
        stream.forEach(System.out::println);
    }
}
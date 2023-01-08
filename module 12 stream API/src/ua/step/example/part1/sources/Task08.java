package ua.step.example.part1.sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Объединение нескольких стримов в один
 */
public class Task08
{
    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        // метод concat объединяет несколько стримов в один
        Stream<Integer> union = Stream.concat(list1.stream(), list2.stream());
        // териминальная операции будет работать по объедененным стримам
        union.forEach(s -> System.out.print(s + " "));
    }
}
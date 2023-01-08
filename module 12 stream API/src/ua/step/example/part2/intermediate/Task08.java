package ua.step.example.part2.intermediate;

import java.util.stream.IntStream;

/**
 * Пример flatMap
 * Объеденяет элементы многомерного массива в стрим целых чисел и выбирает
 * только нечетные значения
 */
public class Task08
{
    public static void main(String[] args)
    {
        IntStream stream = IntStream.of(2, 3, 4);
        stream.flatMap(x-> IntStream.range(0, x)).forEach(System.out::println);
    }
}
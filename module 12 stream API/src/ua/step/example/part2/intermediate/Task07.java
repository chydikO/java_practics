package ua.step.example.part2.intermediate;

import java.util.Arrays;

/**
 * Пример flatMap
 * Объеденяет элементы многомерного массива в стрим целых чисел и выбирает
 * только нечетные значения
 */
public class Task07
{
    public static void main(String[] args)
    {
        Integer[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        Arrays.stream(data).
            flatMap(row -> Arrays.stream(row)).
            filter(num -> num % 2 == 1).
            forEach(s -> System.out.print(s + " "));
    }
}
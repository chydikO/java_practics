package ua.step.example.part2.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Метод map принимает функцию, которая применяется к каждому элементу стрима и
 * записывает результат обработки обратно в стрим. 
 * Пример выводит значения списка в степени 2
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 4, 6, 8, 10, 12, 14);

        // Старый способ:
        for (Integer n : list)
        {
            int x = n * n;
            System.out.printf("old %d%n", x);
        }

        // Новый способ: выводит квадрат элементов массива
        list.stream()
            .map((x) -> x * x)
            .forEach(System.out::println);
    }
}
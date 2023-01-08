package ua.step.example.part2.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * peek - Возвращает тот же стрим, но применяет функцию к каждому элементу
 * стрима
 */
public class Task10
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("A", "B", "C");
        // выводим промежуточный результат, не меняя исходного стрима
        list = list.stream().
                peek(s -> System.out.print(s + s)).
                collect(Collectors.toList());
        System.out.println();
        list.forEach(System.out::print);
    }
}
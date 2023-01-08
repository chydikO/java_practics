package ua.step.example.part3.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * map + reduce - конвертация в другой тип, используя функцию.
 */
public class Task03
{
    public static void main(String[] args)
    {
        List<String> list = getList();
        Optional<Integer> result = list.stream().
        // перобразует каждую строку в значение типа Integer
                map(Integer::valueOf).
                // агрегирует результат согласно лямбда выражения
                reduce((a, b) -> a + b);
        result.ifPresent(System.out::println);

    }

    public static List<String> getList()
    {
        return Arrays.asList("11","12","13","14","15","16","17","18","19");
    }
}
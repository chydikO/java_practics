package ua.step.example.part2.intermediate;

import java.util.stream.Stream;

import ua.step.example.model.Data;

/**
 * Фильтр. Метод filter принимает предикат, который применяется к стриму
 * фильтруя в нем значения.
 */
public class Task01
{
    public static void main(String[] args)
    {
        Stream<String> stream = Data.getList().stream();
        long count = stream.
        // промежуточная операция в виде ссылки на метод фильтрует поток
                filter("ccc"::equals).
                // терминальная операция
                count();
        System.out.println(count);
        // FIXME подсчитай, какое количество элементов в стриме содержат
        // латинскую букву b
    }
}
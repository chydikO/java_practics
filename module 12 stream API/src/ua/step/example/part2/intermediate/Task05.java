package ua.step.example.part2.intermediate;

import java.util.stream.Stream;

import ua.step.example.model.Data;

/**
 * distinct - удаляет дублирующие элементы из стрима
 */
public class Task05
{
    public static void main(String[] args)
    {
        Stream<String> stream = Data.getList().stream();
        stream
        // промежуточная операция убирает дубликаты значение из стрима
                .distinct()
                .forEach(System.out::println);
    }
}
package ua.step.example.part2.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * peek - Возвращает тот же стрим, но применяет функцию к каждому элементу стрима
 */
public class Task09
{
    public static void main(String[] args)
    {
        Collection<StringBuilder> list = Arrays.asList(
                new StringBuilder("a1"), 
                new StringBuilder("a2"),
                new StringBuilder("a3"));
        
        List<StringBuilder> newList = list.stream().
                peek((p) -> p.append("_new")).
                collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}
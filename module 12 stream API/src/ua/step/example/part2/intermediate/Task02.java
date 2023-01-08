package ua.step.example.part2.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

import ua.step.example.model.Data;

/**
 * Sorted - сортировка стрима
 */
public class Task02
{
    public static void main(String[] args)
    {
        Stream<String> stream = Data.getList().stream();

        System.out.println("сортировка в натуральном порядке");
        stream
        // промежуточная операция сортирует поток
                .sorted()
                .forEach(System.out::println);

        System.out.println("сортировка в обратном порядке");

        stream = Data.getList().stream();
        stream
        // можно задавать компаратор сортировки в обратном порядке 
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        
    }
}
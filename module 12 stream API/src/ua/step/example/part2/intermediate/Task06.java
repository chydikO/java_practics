package ua.step.example.part2.intermediate;

import java.util.Arrays;
import java.util.Collection;

/**
 * flatMap - Похоже на map, но может создавать из одного элемента несколько
 */
public class Task06
{
    public static void main(String[] args)
    {
        Collection<String> collection = Arrays.asList("1,2,0", "4,5", "9");
        String[] mas = collection.stream()
             // берет строку из элемента стрима и преобразует ее в набор элементов
             .flatMap((p) -> Arrays.asList(p.split(","))
                     .stream()
                     ).toArray(String[]::new);
        String delimiter = ", ";
        Arrays.stream(mas).map(o->o+delimiter).forEach(System.out::print);
    }
}
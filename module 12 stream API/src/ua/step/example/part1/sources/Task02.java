package ua.step.example.part1.sources;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Получение стрима из коллекции
 */
public class Task02
{
    public static void main(String[] args)
    {
        Collection<String> collection = Arrays.asList("a", "b", "c", "d");
        
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);
    }
}

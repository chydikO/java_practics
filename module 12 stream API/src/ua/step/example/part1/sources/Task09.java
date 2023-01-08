package ua.step.example.part1.sources;

import java.util.stream.Stream;

/**
 * 
 * Созадание стрима на основе статического метода of класса Stream 
 *
 */
public class Task09
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("aaa", "bbb","ccc");
        stream.forEach(System.out::println);
    }
}
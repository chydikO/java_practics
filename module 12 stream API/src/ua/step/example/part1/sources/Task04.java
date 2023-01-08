package ua.step.example.part1.sources;

import java.util.stream.Stream;

/**
 * Получение стрима c использованием стрим билдера
 */
public class Task04
{
    public static void main(String[] args)
    {
        Stream<String> streamBuilder =
                Stream.<String>builder()
                    .add("a")
                    .add("b")
                    .add("c")
                .build();
        streamBuilder.forEach(System.out::print);
    }
}

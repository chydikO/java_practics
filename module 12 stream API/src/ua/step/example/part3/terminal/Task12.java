package ua.step.example.part3.terminal;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Объединяющий коллектор 
 */
public class Task12
{
    public static void main(String[] args)
    {
            String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">"));
            System.out.println(s);
    }
}
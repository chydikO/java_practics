package ua.step.example.part4.other;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Новые методе в компиляторе регулярных выражений
 */
public class Task02
{
    public static void main(String[] args)
    {
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c, d");
        streamOfString.forEach(System.out::println);
    }
}
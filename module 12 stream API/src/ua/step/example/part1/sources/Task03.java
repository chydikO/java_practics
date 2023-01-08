package ua.step.example.part1.sources;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Получение стрима из массива
 */
public class Task03
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"a", "b", "c", "d"};
        
        // метод stream добавлен в класс Arrays в java 8
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::print);
        
        System.out.println();
        
        // преобразоввание части массива в стрим
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(System.out::print);
    }
}

package ua.step.example.part1.sources;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * 
 * Стримы для примитивных типов Создаёт стрим из числового промежутка
 * [start..end), то есть от start (включительно) по end.
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        // Создаёт стрим из числового промежутка [start..end), то есть от start
        // (включительно) по end (исключительно).
        // стрим целых чисел от 1 до 2
        IntStream intStream1 = IntStream.range(1, 3);
        intStream1.forEach(System.out::println);
        System.out.println("----------------");

        // стрим целых чисел указаных значений
        IntStream intStream2 = IntStream.of(6, 9, 12);
        intStream2.forEach(System.out::println);
        System.out.println("----------------");

        // Создаёт стрим из числового промежутка [start..end], то есть от start
        // (включительно) по end (включительно).
        LongStream longStream = LongStream.rangeClosed(3_000_000_000L, 3_000_000_005L);
        longStream.forEach(System.out::println);
        System.out.println("----------------");

        IntStream streamOfChars = "abc".chars();
        streamOfChars.forEach(System.out::println);
    }
}
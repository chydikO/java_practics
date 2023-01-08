package ua.step.example.part4.other;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Лямбда и вычислительные потоки
 *
 */
public class Task00
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Thread thread1 = new Thread(() -> numbers.forEach(System.out::println));
        thread1.start();
        Thread thread2 = new Thread(() -> numbers.forEach(System.out::print));
        thread2.start();
        // запустите пример несколько раз
    }
}

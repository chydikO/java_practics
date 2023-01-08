package ua.step.example.part2.intermediate;

import java.util.Arrays;
import java.util.Collection;

/**
 * 
 * mapToInt преобразует стрим в набор целых чисел
 *
 */
public class Task11
{
    public static void main(String[] args)
    {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        int[] mas = collection.stream().
                //  убрает первый символ из каждого элемента и возвращает массив чисел 
                mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println(Arrays.toString(mas));
    }
}
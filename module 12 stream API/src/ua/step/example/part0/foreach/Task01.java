package ua.step.example.part0.foreach;

import java.util.HashSet;
import java.util.Set;

public class Task01
{
    public static void main(String[] args)
    {
        Set<String> list = new HashSet<>();
        for (int i = 0; i < 50; i++)
        {
            list.add(String.valueOf(i));
        }
        // применяте функцию вывод в консоль к каждому элементу коллекции 
        list.forEach(System.out::println);
    }
}

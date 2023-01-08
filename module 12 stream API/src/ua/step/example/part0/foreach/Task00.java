package ua.step.example.part0.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task00
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add(rnd.nextInt(100));
        }
        // применяте функцию вывод к каждому элементу коллекции 
        list.forEach(System.out::println);
    }
}

package ua.step.example.part0.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task02
{
    public static void main(String[] args)
    {
        Set<String> list = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++)
        {
            list.add(String.valueOf(i));
        }

        list.forEach(System.out::print);
        List<String> newList = new ArrayList<>(); 

        list.forEach(s -> newList.add(s.toUpperCase()));
        System.out.println();
        newList.forEach(System.out::print);
    }
}
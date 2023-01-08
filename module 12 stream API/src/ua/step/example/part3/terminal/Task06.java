package ua.step.example.part3.terminal;

import java.util.List;
import java.util.stream.Collectors;

import ua.step.example.model.Data;

/**
 * 
 * Коллекторы.
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        List<String> list = Data.getList();
        list.stream().peek(System.out::println)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
    }
}
package ua.step.example.part3.behavior.t04.iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Iterator — поведенческий шаблон проектирования. Представляет собой объект,
 * позволяющий получить последовательный доступ к элементам объекта-агрегата без
 * использования описаний каждого из агрегированных объектов.
 */
public class Task00
{
    public static void main(String[] args)
    {
        Collection<String> set = Stream.of("11","22", "33").collect(Collectors.toSet());
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
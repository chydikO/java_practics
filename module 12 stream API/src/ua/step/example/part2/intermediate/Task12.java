package ua.step.example.part2.intermediate;

import java.util.stream.DoubleStream;

/**
 * boxed - Преобразует примитивный стрим в объектный.
 *
 */
public class Task12
{
    public static void main(String[] args)
    {
        DoubleStream.of(0.1, Math.PI).boxed().map(Object::getClass).forEach(System.out::println);
    }
}
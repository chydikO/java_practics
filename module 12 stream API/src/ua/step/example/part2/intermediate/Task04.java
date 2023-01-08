package ua.step.example.part2.intermediate;

import java.util.stream.Stream;

import ua.step.example.model.Data;

/**
 * Map - применяет лямбда выражения к каждому элементу потока
 */
public class Task04
{
    public static void main(String[] args)
    {
        Stream<String> stream = Data.getList().stream();
        stream
        // промежуточная операция преобразует элемент стрима согласно лямбда
            .map(String::toUpperCase)
            .forEach(System.out::println);
        // FIXME измените код, таким образом, чтобы строки из списка выводились
        // без цифр (если они там содержаться)
    }
}
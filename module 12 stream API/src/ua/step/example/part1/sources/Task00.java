package ua.step.example.part1.sources;

import java.util.stream.Stream;

import ua.step.example.model.Data;

/**
 * Коллекция как источник потока
 */
public class Task00
{
    public static void main(String[] args)
    {
        // получение источника
        Stream<String> stream = Data.getList().stream();

        // конечная (терминальная) операция
        stream.forEach(n -> System.out.print(n + " "));
        
        // FIXME выведи список строк из стрима еще раз
    }
}
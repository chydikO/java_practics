package ua.step.example.part3.terminal;

import java.util.List;
import java.util.Optional;

import ua.step.example.model.Data;

/**
 * reduce - используется для «сборки» элементов, простым языком, если вы хотите
 * в потоке произвести создание нового экземпляра объекта с агрегирующими
 * показателями других элементов.
 */
public class Task04
{
    public static void main(String[] args)
    {
        List<String> list = Data.getList();

        Optional<String> reduced = list.stream().sorted().
        // терминальная операция возвращает опциональное значение
                reduce((s1, s2) -> s1 + ":" + s2);
        reduced.ifPresent(System.out::println);
        // FIXME вывести строку в которой будут объеденены только стоки с
        // цифрами
    }
}
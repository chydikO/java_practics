package ua.step.example.part3.terminal;

import java.util.List;

import ua.step.example.model.Data;

/**
 * count - считает количество элементов в стриме, терминальная операция
 */
public class Task00
{
    public static void main(String[] args)
    {
        List<String> list = Data.getList();
        long startsWithB = list.stream().filter((s) -> s.startsWith("b")).
        // терминальная операция подсчитвает количество элементов в стриме
                count();

        System.out.println(startsWithB); // 3
        // FIXME подсчитайте и выведите в консоль количество строк в коллекции
        // заканчиваются на
        // цифру используя Stream API
        // Подсказка: используй map чтобы сохранить в стриме последние символы и мето 
        // Character.isDigit(ch) для определения цифры
    }
}
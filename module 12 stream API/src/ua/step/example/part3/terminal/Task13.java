package ua.step.example.part3.terminal;

import java.util.List;

import ua.step.example.model.Data;

/**
 * 
 * Простые терминальные операции
 *
 */
public class Task13
{
    public static void main(String[] args)
    {
        List<String> list = Data.getList();
        //Возвращает первый элемент из стрима (возвращает Optional)
        list.stream().findFirst().ifPresent(System.out::println);
        
        //Вернуть последний элемент коллекции или «empty», если коллекция пуста
        list.stream().skip(list.size() - 1).findAny().orElse("empty");
        
        //Возвращает минимальный элемент, в качестве условия использует компаратор
        list.stream().min(String::compareTo).ifPresent(System.out::println);
        
        //Возвращает минимальный элемент, в качестве условия использует компаратор
        list.stream().max(String::compareTo).ifPresent(System.out::println);
    }
}
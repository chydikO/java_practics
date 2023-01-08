package ua.step.example.part3.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Коллекторы. Преобразование данных из списока одного типа в список другого
 * типа
 *
 */
public class Task08
{
    public static void main(String[] args)
    {
        List<String> list = getDragons().stream()
                .map(Dragon::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static List<Dragon> getDragons()
    {
        return Arrays.asList(
                new Dragon("Таргариен", 120), 
                new Dragon("Эйгон III", 321), 
                new Dragon("Тиамат", 6666),
                new Dragon("Караксес", 564));
    }

    static class Dragon
    {
        private String name;
        private int age;

        public Dragon(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }
    }
}
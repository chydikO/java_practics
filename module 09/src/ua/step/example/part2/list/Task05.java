package ua.step.example.part2.list;

import java.util.ArrayList;
import java.util.List;

import ua.step.example.part2.list.model.Person;

/**
 * 
 * Поиск элемента в списке
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<Person>();
        
        Person p1 = new Person("Иванов", "Иван");
        persons.add(p1);
        Person p2 = new Person("Петров", "Петр");
        persons.add(p2);
        
        boolean b = persons.contains("Иванов"); // так нельзя 
        System.out.println("Иванов в списке " + b);
        
        b = persons.contains(p1);
        System.out.println(b);

        b = persons.contains(new Person("Иванов", "Иван"));
        System.out.println(b);
        
        int index = persons.indexOf("Иванов"); // так нельзя 
        System.out.println(index);

        index = persons.indexOf(p2);
        System.out.println(index);
        
        index = persons.indexOf(new Person("Петров", "Петр"));
        System.out.println(index);

    }
}

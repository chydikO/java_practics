package ua.step.example.part3.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import ua.step.example.part3.set.model.Person;

/**
 * 
 * Добавление в множество объектов произвольных классов
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        SortedSet<String> countries = new TreeSet<String>();
        countries.add("Россия");
        countries.add("Франция");
        countries.add("Гондурас");
        countries.add("Кот-Д'Ивуар"); 
        System.out.println(countries); 

        Set<Person> treeSet = new TreeSet<Person>();
        Person person = new Person("Иванов", "Иван");
        treeSet.add(person);  
        //person = new Person("Петров", "Петр");
        //treeSet.add(person);
        // FIXME реализуй в классе Person интерфейс Comparable по указанию преподователя
    }
}

package ua.step.example.part3.set;

import java.util.HashSet;
import java.util.Set;

import ua.step.example.part3.set.model.Person;

/**
 * 
 * Добавление объектов в множество
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
    	Set<Person> sets = new HashSet<Person>();
        Person person1 = new Person("Иванов", "Иван");
        boolean added = sets.add(person1);
        System.out.println(added);
        added = sets.add(person1);
        System.out.println(added);
        Person person2 = new Person("Иванов", "Иван");
        added = sets.add(person2);
        System.out.println(added);

        added = sets.add(null);
        System.out.println(added);
        added = sets.add(null);
        System.out.println(added);
        // FIXME переопределите методы в классе Person по указанию преподователя
    }
}

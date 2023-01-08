package ua.step.example.part3.set;

import java.util.Comparator;
import java.util.TreeSet;

import ua.step.example.part3.set.model.Person;

/**
 * 
 * Компоратор - сортировщик
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        LastNameComporator lastNameComporator = new LastNameComporator();
        TreeSet<Person> treeSet = new TreeSet<Person>(lastNameComporator);
        Person person = new Person("Иванов", "Иван");
        treeSet.add(person);
        person = new Person("Петров", "Петр");
        treeSet.add(person);
        person = new Person("Аксенов", "Александр");
        treeSet.add(person);
        person = new Person("Македонский", "Александр");
        treeSet.add(person);
        person = new Person("Романов", "Роман");
        treeSet.add(person);
        System.out.println(treeSet);

        treeSet = new TreeSet<Person>(new Comparator<Person>()
        {
            @Override
            public int compare(Person person1, Person person2)
            {
                return person1.getFirstName().compareTo(person2.getFirstName());
            }
        });
        person = new Person("Иванов", "Иван");
        treeSet.add(person);
        person = new Person("Федоров", "Петр");
        treeSet.add(person);
        person = new Person("Аксенов", "Александр");
        treeSet.add(person);
        person = new Person("Македонский", "Александр");
        treeSet.add(person);
        person = new Person("Иванов", "Александр");
        treeSet.add(person);
        System.out.println(treeSet);
        // FIXME написать компартаор сортирующий объекты класса Person по имени
        // и фамилии

    }

    static class LastNameComporator implements Comparator<Person>
    {
        @Override
        public int compare(Person person1, Person person2)
        {
            return person1.getLastName().compareTo(person2.getLastName());
        }
    }
}

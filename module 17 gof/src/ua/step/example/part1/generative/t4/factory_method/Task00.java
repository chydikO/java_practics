package ua.step.example.part1.generative.t4.factory_method;

import ua.step.example.part1.generative.t4.factory_method.model.Person;
import ua.step.example.part1.generative.t4.factory_method.model.PersonFactory;
import ua.step.example.part1.generative.t5.abstract_factory.model.PersonType;

/**
 * 
 * Фабричный метод (англ. Factory Method также известен как Виртуальный
 * конструктор (англ. Virtual Constructor)) — порождающий шаблон проектирования,
 * предоставляющий подклассам интерфейс для создания экземпляров некоторого
 * класса. В момент создания наследники могут определить, какой класс создавать.
 * 
 */
public class Task00
{
    public static void main(String[] args)
    {
        /*
         * нельзя создать объекты класса Manager и Worker в данном пакете, так
         * как классы имеют спецификатор доступа package-private (доступны
         * только внутри пакета)
         */
        // Manager man = new Manager();

        PersonFactory factory = new PersonFactory();
        Person person = factory.getPerson(PersonType.MANAGER);
        System.out.println(person);

        person = factory.getPerson(PersonType.WORKER);
        System.out.println(person);

        person = factory.getPerson(PersonType.WORKER);
        System.out.println(person);
        // FIXME добавь в фабричный метод создание студента
    }
}

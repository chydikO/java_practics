package ua.step.example.part1.generative.t4.factory_method.model;

import ua.step.example.part1.generative.t5.abstract_factory.model.PersonType;

class Worker extends Person
{
    public Worker(int id)
    {
        super(id);
    }
}

class Manager extends Person
{
    public Manager(int id)
    {
        super(id);
    }
}

/**
 * Фабрика персон
 */
public class PersonFactory
{
    public int id;

    public Person getPerson(PersonType type)
    {
        switch (type)
        {
            case WORKER:
                return new Worker(id++);
            case MANAGER:
                return new Manager(id++);
        }
        throw new UnsupportedOperationException("Данный тип не поддерживается");
    }
}
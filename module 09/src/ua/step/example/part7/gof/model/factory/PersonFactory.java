package ua.step.example.part7.gof.model.factory;

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
 * Фабрика
 */
public class PersonFactory
{
    private boolean isWorker(int id)
    {
        return id % 2 != 0;
    }

    private boolean isManager(int id)
    {
        return id % 2 == 0;
    }

    public Person getPerson(int id)
    {
        if (isWorker(id))
        {
            return new Worker(id);
        }
        if (isManager(id))
        {
            return new Manager(id);
        }
        return null;
    }
}
package ua.step.example.part7.gof.model.factory;

public abstract class Person
{
    private int id;

    Person(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "id = " + id + " class = " + getClass().getSimpleName();
    }
}

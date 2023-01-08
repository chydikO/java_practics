package ua.step.example.part1.generative.t4.factory_method.model;

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
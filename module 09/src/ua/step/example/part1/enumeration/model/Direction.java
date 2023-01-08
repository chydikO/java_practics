package ua.step.example.part1.enumeration.model;

public enum Direction /*<T>*/ // нельзя использовать шаблоны, нелльзя наследоваться
{
    up, down;

    public Direction opposite()
    {
        return this == up ? down: up;
    }
}

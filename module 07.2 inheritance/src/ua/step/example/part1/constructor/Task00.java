package ua.step.example.part1.constructor;

public class Task00
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.eat();
    }
}

class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public Animal()
    {
        this.name = "Неопределено";
    }

    public void eat(String food)
    {
        System.out.printf("%s есть %s", name, food);
    }
}

// FIXME Унаследуй кошку от класса животное
class Cat
{

    public void eat()
    {
        System.out.println("ловит птичку");
        // super("птичку");
    }
}
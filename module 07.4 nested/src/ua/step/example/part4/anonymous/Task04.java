package ua.step.example.part4.anonymous;

/**
 * 
 * Использование конструктора суперкласса для инициализации состояния. 
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        Animal cat = new Animal("Васька")
        {
            @Override
            void eat()
            {
                System.out.println("колбаску ням-ням");
            }
        };
        System.out.println(cat);
        cat.eat();
    }
}

abstract class Animal
{
    private String name;

    Animal(String name)
    {
        this.name = name;
    }

    abstract void eat();

    @Override
    public String toString()
    {
        return name;
    }
}
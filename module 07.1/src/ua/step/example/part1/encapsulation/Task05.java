package ua.step.example.part1.encapsulation;

/**
 * Передача this в метод, в виде фактического параметра
 * 
 */
public class Task05
{

    public static void main(String[] args)
    {
        Cat tomCat = new Cat();
        tomCat.name = "Том";
        tomCat.size = 3;
        Cat leapoldCat = new Cat();
        leapoldCat.name = "Леапольд";
        leapoldCat.size = 11;

        Dog dog = new Dog();
        dog.name = "Шарик";
        dog.size = 10;
        dog.catching(tomCat);
        dog.catching(leapoldCat);
    }
}

class Cat
{
    int size;
    String name;

    public void escape(Dog dog)
    {
        if (dog.size > size)
        {
            System.out.println(name + ": Бежим");
        }
        else
        {
            System.out.println(name + ": Пшшшш.");
            dog.battle();
        }
    }
}

class Dog
{
    int size;
    String name;

    public void catching(Cat cat)
    {
        System.out.println(name + ": Гав-гав.");
        // здесь в метод передается ссылка на объект собаки, для которого был
        // вызван метод catching
        cat.escape(this);
    }

    public void battle()
    {
        System.out.println(name + ": Ррррррр.");
    }
}
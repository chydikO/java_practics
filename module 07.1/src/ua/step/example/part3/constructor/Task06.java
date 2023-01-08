package ua.step.example.part3.constructor;

/**
 * 
 * Перегрузка конструкторов
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        Cat m = new Cat(1);
        m.print();
        Cat m1 = new Cat("Tom");
        m1.print();
        Cat m2 = new Cat("Murka", 2);
        m2.print();
    }
}

class Cat
{
    private String name;
    private int age;

    // перегруженый конструктор с двумя параметрами
    Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    // перегруженый конструктор с одним параметром типа String
    Cat(String name)
    {
        this(name, 1);
    }
    
    // перегруженый конструктор с одним параметром типа int
    Cat(int age)
    {
        // указанние программе, какой конструктор вызывать вместе с этим
        // this должно быть первым вызовом в конструкторе.
        this("Noname", 2);
        // this(i, i);
    }

    void print()
    {
        System.out.printf("Name: %s, age %d%n", name, age);
    }
}
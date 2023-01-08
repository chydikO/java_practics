package ua.step.example.part4.anonymous;

/**
 * 
 * Инициализация свойств ананимного класса
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        A a = new A(2)
        {
            @Override
            void start()
            {
                x++;
            }
        };
        System.out.println(a.x);
        a.start();
        System.out.println(a.x);
    }
}

abstract class A
{
    int x;

    A(int x)
    {
        this.x = x;
    }

    abstract void start();
}
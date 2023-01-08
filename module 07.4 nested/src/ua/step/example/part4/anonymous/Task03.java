package ua.step.example.part4.anonymous;

/**
 * 
 * Создание объекта анонимного класса используя наследование
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // создание объекта используя анонимный класс 
        Startable t2 = new Startable()
        {
            @Override
            void test()
            {
                System.out.println("test");
            }
        };
        t2.test();
        t2.start();
    }
}

abstract class Startable // implements Test
{
    abstract void test();

    void start()
    {
        System.out.println("start");
    }
}
package ua.step.example.part1.generative.t1.singelton.model;

/**
 * Double-check singelton
 * + Ленивая инициализация 
 * + Высокая производительность 
 * - Поддерживается только с JDK 1.5 [5]
 * 
 */
public class DclSingleton
{
    private static volatile DclSingleton instance;

    public static DclSingleton getInstance()
    {
        DclSingleton localInstance = instance;
        if (localInstance == null)
        {
            synchronized (DclSingleton.class)
            {
                localInstance = instance;
                if (localInstance == null)
                {
                    instance = localInstance = new DclSingleton();
                }
            }
        }
        return localInstance;
    }
    public void test()
    {
        System.out.println("It's DCL singelton");
    }
}
